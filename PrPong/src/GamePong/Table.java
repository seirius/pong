package GamePong;

import java.awt.Graphics;

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
	
	public void refresh(int[] input) {
		sticks[0].refresh(input[0]);
	}
	
	public void render(Graphics g) {
		ball.render(g);
		sticks[0].render(g);
		sticks[1].render(g);
	}
}
