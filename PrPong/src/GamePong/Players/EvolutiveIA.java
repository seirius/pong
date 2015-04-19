package GamePong.Players;

import java.util.ArrayList;
import java.util.Random;

public class EvolutiveIA {

	private ArrayList<ArrayList<Double>> weights;
	private int inputs, outputs;

	public EvolutiveIA(int inputs, int outputs) {
		this.inputs = inputs;
		this.outputs = outputs;
		for(int o = 0; o < outputs; o++){
			weights.add(new ArrayList<Double>());
			for(int o1 = 0; o1 < outputs; o1++)
				weights.get(weights.size() - 1).add((new Random().nextGaussian() - 0.5)/0.01);
		}
	}
	
	public ArrayList<Double> process(ArrayList<Double> input){
		ArrayList<Double> output = new ArrayList<Double>();
		for(int o = 0; o < outputs; o++){	
			output.add(0.0);
			for(int i = 0; i < inputs; i++)
			{
				output.set(output.size() - 1, output.get(output.size() - 1) + weights.get(o).get(i) * input.get(i));
			}
			output.set(output.size() - 1, sigmoid(output.get(output.size() - 1) + weights.get(o).get(output.size() - 1)));
		}
		return output;
	}
	
	public void update(int getPoints, int objPoints){
		ArrayList<ArrayList<Double>> newWeights = new ArrayList<ArrayList<Double>>();
		for(int o = 0; o < outputs; o++){
			newWeights.add(new ArrayList<Double>());
			for(int o1 = 0; o1 < outputs; o1++)
				newWeights.get(newWeights.size() - 1).add(weights.get(o).get(o1)  + (new Random().nextGaussian() - 0.5)*2/(objPoints/getPoints));
		}
	}
	
	public double sigmoid(double x){
		return 1/(1+Math.exp(-x));
	}
	
	public double sigmoidd(double x){
		return sigmoid(x)*(1-sigmoid(x));
	}
	
	
}
