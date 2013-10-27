package test;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color; 

import test.EnumPosition;

public class Fenetre extends JFrame implements MouseMotionListener, KeyListener {
	
	Surface maSurface;
    Balle maBalle;
    private int stop;
	public Fenetre()
	{
		
	    this.setTitle("Ma première fenêtre Java");
	    this.setSize(400, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    //this.setResizable(false);
	    this.setVisible(true);
	    
	    
	    this.maSurface = new Surface();
	    this.maBalle = new Balle();
	    this.stop = 0;
	    //SurfaceImage monImage = new SurfaceImage("G:/Musique/prairie_vahl.jpg");
	    
	    this.getContentPane().add(maBalle);
	    this.getContentPane().validate();
	    this.getContentPane().add(maSurface);
	    
	    
	    /*this.setContentPane(monImage);*/
	   // addMouseListener(this);
		 addMouseMotionListener(this);
	    addKeyListener(this);
	  }
	
	  public void go(){
		  int x;
		  int y;
		    while(this.stop == 0)
		    {
		    	 x = maBalle.getPosX();
		    	 y = maBalle.getPosY();
		    	
		    	 
		    	if(x<=0)
		    	{
		    		
		    		maBalle.directionH = EnumPosition.DROITE;
			    	
		    	}
		    	else if (x>370) {
		    		
		    		maBalle.directionH = EnumPosition.GAUCHE;
			    	
		    	}
		    	
		    	if(y<=0)
		    	{
		    		
		    		maBalle.directionV = EnumPosition.BAS;
			    	
		    	}
		    	else if (y > 400) {
		    		maBalle.directionV = EnumPosition.HAUT;
		    	}
		    	
		    	
		    	if(maBalle.directionH == EnumPosition.DROITE)
		    	{
		    		maBalle.setPosX(++x);
		    	}
		    	else
		    	{
		    		maBalle.setPosX(--x);
		    	}
		    	
		    	if(maBalle.directionV == EnumPosition.BAS)
		    	{
		    		maBalle.setPosY(++y);
		    	}
		    	else
		    	{
		    		maBalle.setPosY(--y);
		    	}
		    	
		    	
		    	
		    	try {
		            Thread.sleep(10);
		            maBalle.repaint();
		          } catch (InterruptedException e) {
		            e.printStackTrace();
		          }
		    }
		  } 

	@Override
	public void mouseDragged(MouseEvent arg0) {

		/*maSurface.setPosX(arg0.getXOnScreen());
		maSurface.setPosY(arg0.getYOnScreen());*/
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) 
	{
		maSurface.setPosX(arg0.getX());
		maSurface.repaint();
		
	}



	@Override
	public void keyPressed(KeyEvent arg0) {
		 
		int x = maSurface.getPosX(), y = maSurface.getPosY();
		
		if(arg0.getKeyCode() == KeyEvent.VK_DOWN)
		{
			y++;
			maSurface.setPosY(y);
		      
		}
		if(arg0.getKeyCode() ==  KeyEvent.VK_UP)
		{
			y--;
			maSurface.setPosY(y);
		      
		}
		if(arg0.getKeyCode() ==  KeyEvent.VK_LEFT)
		{
			x--;
			maSurface.setPosX(x);
		      
		}
		if(arg0.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			x++;
			maSurface.setPosX(x);
		      
		}
		if(arg0.getKeyCode() == KeyEvent.VK_ESCAPE)
		{
			this.stop=1;
		}
		maSurface.repaint(); 
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
