
/**
 * Java1008 extends the idea of the Trunk class to accept a Point object as a parameter.
 * We say that the Trunk 'has-a' Point.
 * 
 * @author Mr. Chetlen 
 * @version December 2014
 */

// This <Trunk> class uses "has-a" composition.
// In this example, a <Point> object is constructed
// outside the <Trunk> class and passed as parameter
// to construct a <Trunk> object.


import java.awt.*;
import java.applet.*;


public class Java1008 extends Applet
{
	public void paint(Graphics g)
	{
      Trunk trunk1 = new Trunk();
      trunk1.drawTrunk(g);

      //Code in a new Point object called point2.  Use the point (350, 400).
      //Code in a new Trunk object called trunk2. Pass it the values: point2, 75, 300, Color.orange
      //Code in the line that will draw trunk2.  Pass it the parameter g.trunk2.drawTrunk(g);
	}
}


class Trunk
{
   //private Point trunkStart;
   private int trunkHeight;
   private int trunkWidth;
   private Color trunkColor;

   public Trunk()
   {
      //trunkStart = new Point(0,0);
      trunkHeight = 320;
      trunkWidth = trunkHeight/4;
      trunkColor = Color.black;
   }

   public Trunk(/*add formal oparameters here */)
   {
      //trunkStart = tS;
      trunkHeight = tH;
      trunkWidth = tW;
      trunkColor = tC;
   }

   public void drawTrunk(Graphics g)
   {
      g.setColor(trunkColor);
      g.fillRect(trunkStart.getX(),trunkStart.getY(),trunkWidth,trunkHeight);
   }
}
