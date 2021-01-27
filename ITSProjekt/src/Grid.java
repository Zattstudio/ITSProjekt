import org.newdawn.slick.Graphics;

import map.MapHandler;


public class Grid extends GameObject {
	
	private int xWidth;
	private int yHeight;
	private int offset = 5;
	private int tileSize;
	
	public Grid(int xWidth, int yHeight, int tileSize, int offset) {
		super();
		this.xWidth = xWidth;
		this.yHeight = yHeight;
		this.tileSize = tileSize;
		this.offset = offset;
		
	}
	
	public void drawGrid(Graphics graphics, MapHandler m) {
		int currentX = getPosX();
		int currentY = getPosY();
		for (int i = 0; i < yHeight; i++) {
			for (int j = 0; j < xWidth; j++) {
				if (j == m.getCurrentX() && i == m.getCurrentY()) {

					graphics.fillArc(currentX, currentY, tileSize, tileSize, 0f, 360f);
				}
				if (m.getTile(j, i) == '#') {
					graphics.fillRect(currentX, currentY, tileSize, tileSize);
				}
				else graphics.drawRect(currentX, currentY, tileSize, tileSize);
				currentX += tileSize + offset;
				
				
			}
			currentX = getPosX();
			currentY += tileSize + offset;;
		}
	}
	
	
	
	
}
