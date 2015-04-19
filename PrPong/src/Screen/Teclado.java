package Screen;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Teclado implements KeyListener{

	private boolean[] keys = new boolean[256];
	public boolean up, down, left, right;
	public boolean air;
	public boolean directionUp, directionDown, directionLeft, directionRight;
	
	int cont = 0;
	
	public void update() {
		up = keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
		
		air = keys[KeyEvent.VK_F];
		
		directionUp = keys[KeyEvent.VK_UP];
		directionDown = keys[KeyEvent.VK_DOWN];
		directionLeft = keys[KeyEvent.VK_LEFT];
		directionRight = keys[KeyEvent.VK_RIGHT];
	}
	
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	public void keyTyped(KeyEvent e) {
		
	}

}