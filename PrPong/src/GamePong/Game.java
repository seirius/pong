package GamePong;

import java.awt.Graphics;

import GamePong.Players.IA;
import GamePong.Players.Player;

public class Game {

	private Table table;
	private Player[] players = new Player[2];
	private boolean running;
	private int[] score = new int[2];
	
	private IA iA1, iA2;
	
	public Game(int screenWidth, int screenHeight) {
		table = new Table(screenWidth, screenHeight);
		
		iA1 = new IA();
		iA2 = new IA();
	}
	
	public void start() {
		
	}
	
	public void refresh(int[] input) {
		int input2[] = new int[2];
		input2[0] = iA1.getNext(table.getBallArea().x, table.getBallArea().y, table.getStick1().x, table.getStick1().y);
		input2[1] = iA2.getNext(table.getBallArea().x, table.getBallArea().y, table.getStick2().x, table.getStick2().y);
		table.refresh(input2);
	}
	
	public void render(Graphics g) {
		table.render(g);
	}
}
