package Gis;



import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Geom.Point3D;
/**
 * this class represent "Packmant" , with Geom in real world
 *
 */
public class Packman {
	private Point3D gps ;
	
//constructors	
	public Packman(Point3D gps) {
		this.gps = gps;
	}
	public Packman(Packman a) {
		this.gps = a.gps;
	}
	  public Packman(String line) { 
		String[] arr = line.split(",");
	    String p = arr[2] + "," + arr[3] + "," + arr[4];
	    gps = new Point3D(p);
	  }
	
	public Point3D getGps() {
		return gps;
	}
	public void setGps(Point3D gps) {
		this.gps = gps;
	}
	public BufferedImage getPacImage() throws IOException {
		return ImageIO.read(new File("packman.png"));
	}
	public BufferedImage getGhostImage() throws IOException {
		return ImageIO.read(new File("ghost.png"));
	}

}
