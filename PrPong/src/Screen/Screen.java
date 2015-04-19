package Screen;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import GamePong.Game;

public class Screen extends Canvas implements Runnable {

	private int width = 900;
	private int height = width / 16 * 9;
	private String title = "Pong";
	private Teclado teclado;
	private long lastTime;
	private Game game;
	private boolean running;

	private JFrame frame;

	public Screen() {
		Dimension dimension = new Dimension(width, height);
		frame = new JFrame();
		setPreferredSize(dimension);

		game = new Game(width, height);
		teclado = new Teclado();

		addKeyListener(teclado);
	}

	public void render() {
		BufferStrategy bs = getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics();
		// Aqui iran los render() de las demas clases
		// El fondo
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());

		game.render(g);

		g.dispose();
		bs.show();
	}

	public void refresh() {
		int[] input = new int[2];
		input[0] = teclado.getState();
		game.refresh(input);
	}

	@Override
	public void run() {
		while (running) {
			refresh();
			render();

			fpsSetter();
		}
	}

	public void fpsSetter() {
		try {
			Thread.sleep(1000 / 60);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void start() {
		frame.setResizable(false);
		frame.setTitle(title);
		frame.add(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		running = true;
	}
}
