package main;

import java.io.IOException;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import map.MapHandler;
import utility.Vector2;

/**
 *
 * @author Luis
 */
public class GameState extends BasicGameState
{
public static final int ID = 0;
String drawmsg = "";
MapHandler mHandler;
Grid grid;
int zuege = 10;
    @Override
    public int getID() {
        return GameState.ID;
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        mHandler = new MapHandler();
        //mHandler.prettyPrint();
        Vector2 mapSize = mHandler.getMaxExtents();
        grid = new Grid((int)mapSize.x, (int)mapSize.y, 50, 10, mHandler);
        grid.setPos(200, 50);
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
    	grphcs.drawString(mHandler.prettyPrintString(), 40, 40);
    	grphcs.drawString(drawmsg, 40, 250);
    	grid.draw(grphcs);
    }
    
    void move(int dirX, int dirY) {
    	drawmsg = "";
    	if(zuege == 0) {
    		return;
		}
	    char nextBlock = mHandler.checkRelative(dirX, dirY);
	    if (nextBlock  != '#'){
			mHandler.setCurrentX(mHandler.getCurrentX()+dirX);
			mHandler.setCurrentY(mHandler.getCurrentY()+dirY);
			//mHandler.prettyPrint();
			zuege -= 1;
			drawmsg = "Z�ge: " + zuege + "\n";
			if(nextBlock=='x') {
				drawmsg += "Du bist in eine Pf�tze gelaufen";
			}
			if(nextBlock=='*') {
				mHandler.setPosition(1, 1);
			}
	    }
	    else {
	    	drawmsg += "Uatsch aut for se woll!";
	    }
    }
    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
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
}
