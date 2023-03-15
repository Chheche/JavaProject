import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class Socle {
	private float xS, yS;

	public Socle(int xS, int yS) {
		if (xS >= 0 && xS <= 1050 && yS >= 0 && yS <= 700) {
			this.xS = xS;
			this.yS = yS;
		} else {
			this.xS = 0;
			this.yS = 0;
		}
	}
	
	public void affichage(Graphics g) {
		/* Personnage_d'accueil */
		g.setColor(Color.gray);
		g.fillOval(xS, yS, 25, 25);
		g.setColor(Color.black);
		g.drawOval(xS, yS, 25, 25);
	}
}
