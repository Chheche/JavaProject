import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class KaioShin {
	private float xK, yK;
	private Image kaioShin;

	public KaioShin(int xK, int yK, Image kaioShin) throws SlickException {
		if (xK >= 0 && xK <= 1050 && yK >= 0 && yK <= 700) {
			this.xK = xK;
			this.yK = yK;
		} else {
			this.xK = 0;
			this.yK = 0;
		}
		kaioShin = new Image("images/kaioShin.png");
	}

	public void affichage(Graphics g) {
		/* Personnage_d'accueil */
		g.drawImage(kaioShin, xK, yK);
	}
}
