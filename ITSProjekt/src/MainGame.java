

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.GameContainer;

import org.newdawn.slick.SlickException;

public class MainGame extends StateBasedGame {

    // Game state identifiers
    //public static final int SPLASHSCREEN = 0;
    //public static final int MAINMENU     = 1;
    public static final int GAME         = 0;
    
    // Application Properties 
    // NOTE: If possible time-wise, replace constants with saved config 
    public static final double SCALE   = 1;
    public static final int WIDTH   = (int) (1280*SCALE);
    public static final int HEIGHT  = (int) (720*SCALE);
    public static final int FPS     = 60;
    public static final double VERSION = 1.0;
    
	
	
	public MainGame(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try
		{
			AppGameContainer appgc;
			appgc = new AppGameContainer(new MainGame("ITProjekt"));
			appgc.setDisplayMode(WIDTH, HEIGHT, false);
                        appgc.setShowFPS(true);
                        appgc.setTargetFrameRate(60);
			appgc.start();
		}
		catch (SlickException ex)
		{
			Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
                        // Crash handling
		}

	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		this.addState(new GameState());
		
	}

}
