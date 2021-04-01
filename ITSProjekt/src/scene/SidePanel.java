package scene;

import org.newdawn.slick.Graphics;

import main.GameObject;

public class SidePanel  extends GameObject{
	
	
	//Button restartBtn = new Button(, null, posX, posX)
	@Override
	public void draw(Graphics gfx) {
		gfx.fillRect(1300, 0, 620, 1080);
		
	}

}
