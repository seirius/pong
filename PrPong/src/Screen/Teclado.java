package Screen;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Teclado implements KeyListener{

	private boolean[] keys = new boolean[256];
	public boolean up, down;
	
	public void refresh() {
		getState();
	}
	
	public int getState() {
		up = keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_S];
		
		if (up) {
			return 0;
		}
		else if (down) {
			return 1;
		}
		else {
			return 2;
		}
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