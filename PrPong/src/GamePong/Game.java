package GamePong;

import java.awt.Graphics;

import GamePong.Players.Player;

public class Game {

	private Table table;
	private Player[] players = new Player[2];
	private boolean running;
	private int[] score = new int[2];
	
	public Game(int screenWidth, int screenHeight) {
		table = new Table(screenWidth, screenHeight);
	}
	
	public void start() {
		
	}
	
	public void refresh(int[] input) {
		int input2[] = new int[2];
		input2[0] = input[0];
		table.refresh(input2);
	}
	
	public void render(Graphics g) {
		table.render(g);
	}
}
