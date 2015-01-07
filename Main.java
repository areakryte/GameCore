
public class Main {

	public static void main(String args[]){
		SimpleMap mapOne = new SimpleMap(3,9);
		mapOne.verticleMap.get(1).get(2).terrain = CellState.Impassible;
		//System.out.println(mapOne.verticleMap.get(0).size());
		mapOne.print();
	}
}
