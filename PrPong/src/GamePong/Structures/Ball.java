package GamePong.Structures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import sun.awt.X11.XDataTransferer;

public class Ball {
	private Rectangle ballArea;
	
	private int ballWidth = 20;
	private int ballHeight = 20;
	private double dir = 0.0;
	private double speed = 1.0;

	public Ball(int widthScreen, int heightScreen) {
		dir = new Random().nextDouble() * Math.PI*2;
		ballArea = new Rectangle((int) widthScreen / 2 - ballWidth / 2, (int) heightScreen / 2 - ballHeight / 2, ballWidth, ballHeight);
	}
	
	public void choque(int where, double stickSpeed){
		switch (where) {
			case 0:
				//UP
				if(dir % 360 > Math.PI/2) 
					dir += Math.PI/2;
				else if(dir % 360 < Math.PI/2)
					dir -= Math.PI/2;	
				else
					dir = -new Random().nextDouble() * Math.PI;			
				break;
			case 1:
				//DOWN
				if(dir % 360 > Math.PI*3/2) 
					dir += Math.PI/2;
				else if(dir % 360 < Math.PI*3/2)
					dir -= Math.PI/2;	
				else
					dir = new Random().nextDouble() * Math.PI;		
				break;
			case 2:
				//LEFT
				if(speed == 0){
					if(dir % 360 > 0) 
						dir += Math.PI/2;
					else if(dir % 360 < 0)
						dir -= Math.PI/2;	
					else
						dir = -dir;	
					}
				else
					dir = (new Random().nextDouble()* Math.PI + Math.PI/2) ;
				break;
			case 3:
				//RIGHT
				if(speed == 0){
					if(dir % 360 > Math.PI/2) 
						dir += Math.PI/2;
					else if(dir % 360 < Math.PI/2)
						dir -= Math.PI/2;	
					else
						dir = (new Random().nextDouble()* Math.PI - Math.PI/2);
					}
				else
					dir = (new Random().nextDouble() + Math.PI/2) * Math.PI;
			default:
				break;
	}
		
	}

	public void refresh() {		
		ballArea.setLocation((int) (ballArea.getCenterX() + Math.cos(dir)), (int) (ballArea.getCenterY() + Math.sin(dir)));
	}
	
	public Rectangle getBallArea() {
		return ballArea;
	}

	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(ballArea.x, ballArea.y, ballWidth, ballHeight);
	}
}
