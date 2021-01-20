
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author Luis
 */
public class GameState extends BasicGameState
{
public static final int ID = 0;
String testmsg = "This is the Menu placeholder aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
String drawmsg = "";

    @Override
    public int getID() {
        return GameState.ID;
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
        grphcs.drawString(drawmsg, 100, 100);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
    if (drawmsg.length() < testmsg.length()){
        drawmsg = testmsg.substring(0, drawmsg.length()+1);
    }
    
    }
}
