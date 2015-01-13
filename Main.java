import java.util.Random;
import java.lang.Math;

public class Main {

	public static void main(String args[]){
		mapGeneration().print();
	}
	
	private static SimpleMap mapGeneration(){
		Random rand = new Random();
		int height = rand.nextInt(30 - 25) + 25;
		int width = rand.nextInt(30 - 25) + 25;
		System.out.println(Math.abs(height)
				+ " "
				+ Math.abs(width));
		return new SimpleMap(height, width);
	}
}
