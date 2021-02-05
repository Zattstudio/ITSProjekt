package main;
import org.newdawn.slick.Graphics;

import map.MapHandler;


public class Grid extends GameObject {
	
	private int xWidth;
	private int yHeight;
	private int offset = 5;
	private int tileSize;
	private MapHandler m;
	
	public Grid(int xWidth, int yHeight, int tileSize, int offset, MapHandler m) {
		super();
		this.xWidth = xWidth;
		this.yHeight = yHeight;
		this.tileSize = tileSize;
		this.offset = offset;
		this.m = m;
	}
	

	@Override
	public void draw(Graphics gfx) {
		int currentX = getPosX();
		int currentY = getPosY();
		for (int i = 0; i < yHeight; i++) {
			for (int j = 0; j < xWidth; j++) {
				if (j == m.getCurrentX() && i == m.getCurrentY()) {

					gfx.fillArc(currentX, currentY, tileSize, tileSize, 0f, 360f);
				}
				if ((char) m.getTile(j, i) == '#') {
					gfx.fillRect(currentX, currentY, tileSize, tileSize);
				}
				else gfx.drawRect(currentX, currentY, tileSize, tileSize);
				currentX += tileSize + offset;
				
				
			}
			currentX = getPosX();
			currentY += tileSize + offset;;
		}
		
	}
	
	
	
	
}
