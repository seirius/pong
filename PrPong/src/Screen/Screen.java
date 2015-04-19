package Screen;

import java.awt.Canvas;
import java.awt.Dimension;

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
	
	public void Screen() {
		Dimension dimension = new Dimension(width, height);
		frame = new JFrame();
		setMinimumSize(dimension);
	}
	
	public void render() {
		
	}
	
	public void refresh() {
		
	}

	@Override
	public void run() {
		
	}
	
	public void fpsSetter() {
		
	}
	
	public void start() {
		frame.setResizable(false);
		frame.setTitle(title);
		frame.add(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
