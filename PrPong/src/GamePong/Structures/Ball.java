package GamePong.Structures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball {
	private Rectangle ballArea;
	
	private int ballWidth = 20;
	private int ballHeight = 20;
	private double Xdir = 0;
	private double Ydir = 0;
	private double xPos = 0.0;
	private double yPos = 0.0;

	public Ball(int widthScreen, int heightScreen) {
		Xdir = widthScreen / 2 - ballWidth / 2;
		Ydir = heightScreen / 2 - ballHeight / 2;				
		ballArea = new Rectangle((int) Xdir, (int) Ydir, ballWidth, ballHeight);
	}
	
	public choque(int where){
		switch (where) {
		case 0:
				
			break;
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;
		default:
			break;
	}
		
	}

	public void refresh() {
		xPos += Xdir;
		yPos += Ydir;
		ballArea.setLocation((int) xPos, (int) yPos);
	}
	
	public Rectangle getBallArea() {
		return ballArea;
	}

	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(ballArea.x, ballArea.y, ballWidth, ballHeight);
	}
}
