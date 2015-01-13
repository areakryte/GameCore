import java.util.ArrayList;
import java.util.Random;

public class SimpleMap extends AbstractMap{

	SimpleMap()
	{
		Random rand = new Random();
		int horizontalMapLength = rand.nextInt(30 - 25) + 25;
		int cellLength = rand.nextInt(30 - 25) + 25;
		horizontalPopulate(horizontalMapLength, cellLength);
	}
	
	SimpleMap(int horizontalMapLength){
		horizontalPopulate(horizontalMapLength, 0);
	}
	
	SimpleMap(int horizonthorizontalMapLengthalMap, int cellLength){
		horizontalPopulate(horizonthorizontalMapLengthalMap, cellLength);
	}
	
	public void print()
	{
		for(int i = 0; i < verticleMap.size(); i++)
		{
			for(SimpleCell cell: verticleMap.get(i)){
				if(cell.terrain.equals(CellState.Passible))
					System.out.print("[ ]");
				else if(cell.terrain.equals(CellState.Impassible))
					System.out.print("[X]");
			}
			System.out.println();
		}
	}
	
	private void horizontalPopulate(int horizontalMap, int cellLength){
		for(int i = 0; i < horizontalMap; i++){
			ArrayList<SimpleCell> arr = new ArrayList();
			for(int j = 0; j < cellLength; j++){
				SimpleCell cell = new SimpleCell();
				arr.add(cell);
			}
			verticleMap.add(arr);
		}
	}
	
}
