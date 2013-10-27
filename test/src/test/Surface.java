package test;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;


public class Surface extends JPanel {
	
	private int posX ;
	  private int posY;
	
	  Surface()
	  {
		  super();
		  this.posX = 0;
		  this.posY = 410;
	  }
	
	  public void paintComponent(Graphics g){
		  g.setColor(Color.white);
		    //On le dessine de sorte qu'il occupe toute la surface
		  g.fillRect(0, posY, 400, 5);
		    //On red�finit une couleur pour le rond
		    g.setColor(Color.red);
		    //On le dessine aux coordonn�es souhait�es
		    g.fillRect(posX, posY, 50, 5);
		  }
		 
		  public int getPosX() {
		    return posX;
		  }
		 
		  public void setPosX(int posX) {
		    
			  if(posX <330)
			  {
				  this.posX = posX;
			  }
			  
		  }
		 
		  public int getPosY() {
		    return posY;
		  }
		 
		  public void setPosY(int posY) {
		    this.posY = posY;
		  }     
	

}
