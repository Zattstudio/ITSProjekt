package main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import scene.Background;

public class MenuState extends BasicGameState {
	
	public static final int ID = 1;
	private Background bg;
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		bg = new Background("assets/gfx/scene/pixeltester.png", 5);

	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics gph) throws SlickException {
		
		bg.draw(gph);
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
		
		Input inp = gc.getInput();
		if (inp.isKeyPressed(Input.KEY_ENTER)) {
			sbg.enterState(0);
		}
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return ID;
	}

}
