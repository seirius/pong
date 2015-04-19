package GamePong.Players;

import java.util.ArrayList;

public class IA {
	private EvolutiveIA evo;

	public IA() {
		evo = new EvolutiveIA(4, 3);
	}

	public int getNext(int bolaX, int bolaY, int stickX, int stickY) {
		ArrayList<Double> inputs = new ArrayList<Double>();
		inputs.add((double) bolaX);
		inputs.add((double) bolaY);
		inputs.add((double) stickX);
		inputs.add((double) stickY);
		ArrayList<Double> output = evo.process(inputs);
		int max = 0;
		for (int i = 1; i < output.size(); i++) {
			if (output.get(i) > output.get(max))
				max = i;
		}
		return max;
	}
}
