import Screen.Screen;


public class Main {
	
	public static void main(String[] args) {
		Screen screen = new Screen();
		
		screen.start();
		Thread thread = new Thread(screen);
		thread.start();
	}
}
