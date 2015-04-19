package GamePong.Structures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball {

	private Rectangle ballArea;
	
	private int ballWidth = 20;
	private int ballHeight = 20;
	
	public Ball(int widthScreen, int heightScreen) {
		ballArea = new Rectangle(widthScreen/2 - ballWidth/2, heightScreen/2 - ballHeight/2, ballWidth, ballHeight);
	}
	
	public void refresh() {
		
	}
	
	public Rectangle getBallArea() {
		return ballArea;
	}

	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(ballArea.x, ballArea.y, ballWidth, ballHeight);
	}
}
