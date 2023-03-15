
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class DragonBall extends StateBasedGame {

	public DragonBall(String title) {
		super(title);
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		addState(new Niveau1());
		/*addState(new Niveau2());*/
		enterState(0);
	}
}
