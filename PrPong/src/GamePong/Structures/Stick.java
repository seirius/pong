package GamePong.Structures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Stick {

	private Rectangle stickArea;
	public static int stickWidth = 20;
	public static int stickHeight = 60;
	
	//init = posicion inicial
	public Stick(int initX, int initY) { 
		stickArea = new Rectangle(initX, initY, stickWidth, stickHeight);
	}
	
	public void moveStick(int input) {
		if (input == 0) {
			stickArea.setLocation(stickArea.x, stickArea.y - 2);
		}
		else if (input == 1) {
			stickArea.setLocation(stickArea.x, stickArea.y + 2);
		}
	}
	
	public Rectangle getStickArea() {
		return stickArea;
	}

	public void refresh(int input) {
		moveStick(input);
	}
	
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(stickArea.x, stickArea.y, stickWidth, stickHeight);
	}
}
