package map;


public class MapHandler {
	char[][] mapData = new char[][] {
		{'#','#','#','#','#','#','#','#','#','#'},
		{'#','.','.','.','.','.','.','.','.','#'},
		{'#','.','.','.','.','#','#','#','.','#'},
		{'#','.','.','.','.','.','.','.','.','#'},
		{'#','#','#','#','#','.','.','.','.','#'},
		{'#','.','.','.','.','.','.','.','.','#'},
		{'#','.','.','#','.','.','#','.','.','#'},
		{'#','.','.','#','.','.','#','.','.','#'},
		{'#','.','p','#','.','.','#','.','.','#'},
		{'#','#','#','#','#','#','#','#','#','#'},
	}; // Two dimensional Array (Table) that holds the chars
	
	// temp solution for one test map
	/*["##########",
	 * "#........#",
	 * "#....###.#",
	 * "#........#",
	 * "#####....#",
	 * "#../.....#",
	 * "#..#..#..#",
	 * "#..#..#..#",
	 * "#.p#..#..#",
	 * "##########"]
	 * */
	
	
	
	private int currentX; // current x position dispatched from player
	private int currentY; // current y position dispatched from player
	final char playerChar = 'p'; // player start char
	
	
	public MapHandler() {
		
	}
	
	void findPlayer() {
		for (int i = 0; i < mapData.length; i++) {
			for (int j = 0; j < mapData[i].length; j++) {
				if (mapData[i][j] == playerChar) {
					currentX = j;
					currentY = i;
					return;		
				}
			}
		}
		// Fallback handling here
	}
	
	public char checkRelative(int xOff, int yOff) {
		return mapData[currentY+yOff][currentX+xOff];
	}
	
	public char getCurrentTile() {
		return mapData[currentY][currentX];
	}
	
	
	// More of a debug function for testing (formerly printFull)
	public void prettyPrint() {
		for (int i = 0; i < mapData.length; i++) {
			for (int j = 0; j < mapData[i].length; j++) {
				if (i == currentY && j == currentX) {
					System.out.print('@');
				}
				else {
					System.out.print(mapData[i][j]);
				}
			}
			System.out.print("\n");
		}
	}
	
}
