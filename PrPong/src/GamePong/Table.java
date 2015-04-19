package GamePong;

import java.awt.Graphics;
import java.awt.Rectangle;

import GamePong.Structures.Ball;
import GamePong.Structures.Puntuation;
import GamePong.Structures.Stick;

public class Table {

	private Ball ball;
	private Stick[] sticks = new Stick[2];
	private Puntuation[] score = new Puntuation[2];
	
	private int screenWidth;
	private int screenHeight;
	
	public Table(int screenWidth, int screenHeight) {
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		
		ball = new Ball(screenWidth, screenHeight);
		sticks[0] = new Stick(10, 20);
		sticks[1] = new Stick(screenWidth - Stick.stickWidth - 10, 20);
	}
	
	public Rectangle getBallArea() {
		return ball.getBallArea();
	}
	
	public Rectangle getStick1() {
		return sticks[0].getStickArea();
	}
	
	public Rectangle getStick2() {
		return sticks[1].getStickArea();
	}
	
	public void refresh(int[] input) {
		sticks[0].refresh(input[0]);
		sticks[1].refresh(input[1]);
	}
	
	public void render(Graphics g) {
		ball.render(g);
		sticks[0].render(g);
		sticks[1].render(g);
	}
}
