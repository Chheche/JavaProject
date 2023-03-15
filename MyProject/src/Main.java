import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {

	public static void main(String[] args) throws SlickException {
		DragonBall dragonball = new DragonBall("Dragon Ball");
		AppGameContainer app = new AppGameContainer(dragonball);
		app.setDisplayMode(1050, 700, false);
		app.setShowFPS(false);
		app.start();
	}

}
