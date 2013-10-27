package test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import test.EnumPosition;

public class Balle extends JPanel {
	
	private int posX ;
	  private int posY;
	public EnumPosition directionH;
	public EnumPosition directionV;
	  Balle()
	  {
		  super();
		  this.posX = 210;
		  this.posY = 410;
		  this.directionH = EnumPosition.GAUCHE;
		  this.directionV = EnumPosition.HAUT;
	  }
	
	  public void paintComponent(Graphics g){
		  g.setColor(Color.white);
		    //On le dessine de sorte qu'il occupe toute la surface
		    g.fillRect(0, 0, 400, 410);
		    //On red�finit une couleur pour le rond
		    g.setColor(Color.blue);
		    //On le dessine aux coordonn�es souhait�es
		    g.fillOval(posX, posY, 10, 10);
		  }
	  
	  public int getPosX() {
		    return posX;
		  }
		 
		  public void setPosX(int posX) {
		    
			  
				  this.posX = posX;
			  
			  
		  }
		 
		  public int getPosY() {
		    return posY;
		  }
		 
		  public void setPosY(int posY) {
		    this.posY = posY;
		  }     
		  
		  
}
