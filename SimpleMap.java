import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimpleMap extends AbstractMap{

	Random randomCoordinateSeed = new Random();
	int horizontalMapLength = randomCoordinateSeed.nextInt(30 - 25) + 25;
	int cellLength = randomCoordinateSeed.nextInt(30 - 25) + 25;
	
	SimpleMap()
	{
		horizontalPopulate(horizontalMapLength, cellLength);
	}
	
	public void print()
	{
		renderMap();
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
			ArrayList<SimpleCell> arr = new ArrayList<SimpleCell>();
			for(int j = 0; j < cellLength; j++){
				SimpleCell cell = new SimpleCell();
				arr.add(cell);
			}
			verticleMap.add(arr);
		}
	}
	
	private void setMap(){
		Random rand = new Random();
		List coords = new ArrayList();
		int x;
		int y;
		
		
	}
	
	private void renderMap(){
		verticleMap.get(0).get(0).terrain = CellState.Impassible;
		verticleMap.get(0).get(0).terrain = CellState.Impassible;
	}
	
}
