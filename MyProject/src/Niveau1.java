
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Niveau1 extends BasicGameState {

	public Niveau1() {
	}

	@Override
	public void init(GameContainer gc, StateBasedGame g) throws SlickException {

	}

	@Override
	public void render(GameContainer gc, StateBasedGame g, Graphics gr) throws SlickException {

	}

	@Override
	public void update(GameContainer gc, StateBasedGame g, int delta) throws SlickException {
		Input inp = gc.getInput();
		if(inp.isKeyPressed(Input.KEY_SPACE))
			sbg.enterState(1);
	}

	@Override
	public int getID() {
		return 0;
	}

}
