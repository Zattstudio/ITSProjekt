

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import map.MapHandler;

/**
 *
 * @author Luis
 */
public class GameState extends BasicGameState
{
public static final int ID = 0;
String testmsg = "This is the Menu placeholder aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
String drawmsg = "";
MapHandler mHandler;

    @Override
    public int getID() {
        return GameState.ID;
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        mHandler = new MapHandler();
        mHandler.prettyPrint();
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
	    int dirX = 0,dirY = 0;
	    Input inp = gc.getInput();
	    if (inp.isKeyPressed(Input.KEY_LEFT)) {
	    	dirX = -1;
	    	move(dirX, dirY);
	    }
	    else if (inp.isKeyPressed(Input.KEY_RIGHT)) {
			dirX = 1;
			move(dirX, dirY);
		}
	    else if (inp.isKeyPressed(Input.KEY_UP)) {
			dirY = -1;
			move(dirX, dirY);
		}
	    else if (inp.isKeyPressed(Input.KEY_DOWN)) {
			dirY = 1;
			move(dirX, dirY);
		}
	    

    }
    
    void move(int dirX, int dirY) {
	    char nextBlock = mHandler.checkRelative(dirX, dirY);
	    if (nextBlock  != '#'){
			mHandler.setCurrentX(mHandler.getCurrentX()+dirX);
			mHandler.setCurrentY(mHandler.getCurrentY()+dirY);
			mHandler.prettyPrint();
	    }
    }
    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {

    }
}
