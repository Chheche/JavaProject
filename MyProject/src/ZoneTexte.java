import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class ZoneTexte {
	private float xT, yT;
	private Image zoneTexte;

	public ZoneTexte(int xT, int yT, Image zoneTexte) throws SlickException {
		if (xT >= 0 && xT <= 1050 && yT >= 0 && yT <= 700) {
			this.xT = xT;
			this.yT = yT;
		} else {
			this.xT = 0;
			this.yT = 0;
		}
		zoneTexte = new Image("images/zoneTexte.png");
	}

	public void affichage(Graphics g) {
		/* Personnage_d'accueil */
		g.drawImage(zoneTexte, xT, yT);
	}
}
