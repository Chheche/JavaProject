import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class DragonBall extends BasicGame {

	private Image land;
	private Image kaioShin;
	private Image crystal_1;
	private Image crystal_2;
	private Image crystal_3;
	private Image crystal_4;
	private Image crystal_5;
	private Image crystal_6;
	private Image crystal_7;
	private Image detecteur_boules_crystal;



	@Override
	public void init(GameContainer gc) throws SlickException {
		land = new Image("images/Kaio.png");
		kaioShin = new Image("images/kaioShin.png");
		crystal_1 = new Image("images/crystal_1.png");
		crystal_2 = new Image("images/crystal_2.png");
		crystal_3 = new Image("images/crystal_3.png");
		crystal_4 = new Image("images/crystal_4.png");
		crystal_5 = new Image("images/crystal_5.png");
		crystal_6 = new Image("images/crystal_6.png");
		crystal_7 = new Image("images/crystal_7.png");
		detecteur_boules_crystal = new Image("images/detecteur_boules_crystal.png");
		
		/* Launcher launcher = new Launcher(); */
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		/* Fond d'écran */
		g.drawImage(land, 0, 0);
		
		/* Personnage_d'accueil */
		kaioShin.draw(550, 75,(int)(kaioShin.getWidth()*0.5),(int)(kaioShin.getHeight()*0.5));
		
		/* Texte_d'apparition */
		g.setColor(Color.blue);
		g.drawString("This is the Kaio's planet", 425, 360);
		
		/* Socle_crystal 1 */
		g.setColor(Color.gray);
		g.fillOval(990, 10, 25, 25);
		g.setColor(Color.black);
		g.drawOval(990, 10, 25, 25);
		
		/* Crystal 1 */
		crystal_1.draw(988, 9,(int)(crystal_1.getWidth()*0.37),(int)(crystal_1.getHeight()*0.37));
		
		/* Socle_crystal 2 */
		g.setColor(Color.gray);
		g.fillOval(990, 40, 25, 25);
		g.setColor(Color.black);
		g.drawOval(990, 40, 25, 25);
		
		/* Crystal 2 */
		crystal_2.draw(988, 39,(int)(crystal_2.getWidth()*0.37),(int)(crystal_2.getHeight()*0.37));
		
		/* Socle_crystal 3 */
		g.setColor(Color.gray);
		g.fillOval(990, 70, 25, 25);
		g.setColor(Color.black);
		g.drawOval(990, 70, 25, 25);
		
		/* Crystal 3 */
		crystal_3.draw(988, 69,(int)(crystal_3.getWidth()*0.37),(int)(crystal_3.getHeight()*0.37));
		
		/* Socle_crystal 4 */
		g.setColor(Color.gray);
		g.fillOval(965, 55, 25, 25);
		g.setColor(Color.black);
		g.drawOval(965, 55, 25, 25);
		
		/* Crystal 4 */
		crystal_4.draw(962, 53,(int)(crystal_4.getWidth()*0.37),(int)(crystal_4.getHeight()*0.37));
		
		/* Socle_crystal 5 */
		g.setColor(Color.gray);
		g.fillOval(965, 25, 25, 25);
		g.setColor(Color.black);
		g.drawOval(965, 25, 25, 25);
		
		/* Crystal 5 */
		crystal_5.draw(963, 23,(int)(crystal_5.getWidth()*0.37),(int)(crystal_5.getHeight()*0.37));
		
		/* Socle_crystal 6 */
		g.setColor(Color.gray);
		g.fillOval(1015, 55, 25, 25);
		g.setColor(Color.black);
		g.drawOval(1015, 55, 25, 25);
		
		/* Crystal 6 */
		crystal_6.draw(1016, 54,(int)(crystal_6.getWidth()*0.052),(int)(crystal_6.getHeight()*0.052));
		
		/* Socle_crystal 7 */
		g.setColor(Color.gray);
		g.fillOval(1015, 25, 25, 25);
		g.setColor(Color.black);
		g.drawOval(1015, 25, 25, 25);
		
		/* Crystal 7 */
		crystal_7.draw(1014, 23,(int)(crystal_7.getWidth()*0.37),(int)(crystal_7.getHeight()*0.37));
		
		/*Detecteur_boules_de_crystal */
		detecteur_boules_crystal.draw(10, 525,(int)(detecteur_boules_crystal.getWidth()*0.6),(int)(detecteur_boules_crystal.getHeight()*0.6));
	}

	@Override
	public void update(GameContainer agc, int delta) throws SlickException {

	}

}
