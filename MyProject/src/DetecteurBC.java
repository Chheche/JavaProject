import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class DetecteurBC {
	private float xBC, yBC;
	private Image detecteurBC;

	public DetecteurBC(int xBC, int yBC, Image detecteurBC) throws SlickException {
		if (xBC >= 0 && xBC <= 1050 && yBC >= 0 && yBC <= 700) {
			this.xBC = xBC;
			this.yBC = yBC;
		} else {
			this.xBC = 0;
			this.yBC = 0;
		}
		detecteurBC = new Image("images/detecteurBC.png");
	}

	public void affichage(Graphics g) {
		/* Personnage_d'accueil */
		g.drawImage(detecteurBC, xBC, yBC);
		,l,l
	}
}
