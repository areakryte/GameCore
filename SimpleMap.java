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
		setMap();
		for(int i = 0; i < verticleMap.size(); i++)
		{
			for(SimpleCell cell: verticleMap.get(i)){
				if(cell.terrain.equals(CellState.Passible))
					System.out.print("[ ]");
				else if(cell.terrain.equals(CellState.Impassible))
					System.out.print("[X]");
				else if(cell.terrain.equals(CellState.Player))
					System.out.print("[O]");
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
		ArrayList<Integer> xCoordinates = new ArrayList<Integer>();
		ArrayList<Integer> yCoordinates = new ArrayList<Integer>();
		int randomBlock = (horizontalMapLength * cellLength) / 3;
		
		for(int i = 0; i < randomBlock; i++){
			int x = rand.nextInt(horizontalMapLength);
			int y = rand.nextInt(cellLength);
			xCoordinates.add(x);
			yCoordinates.add(y);
		}
		
		for(int i = 0; i < randomBlock; i++){
			int x = xCoordinates.get(0);
			int y = yCoordinates.get(0);
			verticleMap.get(x).get(y).terrain = CellState.Impassible;
			xCoordinates.remove(0);
			yCoordinates.remove(0);
		}
		
		verticleMap.get(horizontalMapLength/2).get(cellLength/2).terrain = CellState.Player;
	}
	
}
