
/**
 * The <Trunk> class can now join the <Point> class
 * as a stand-alone class ready to be used by other classes.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.applet.*;


public class TrunkRunner extends Applet
{
	public void paint(Graphics g)
	{
      Trunk trunk1 = new Trunk();
      trunk1.drawTrunk(g);

      Point point2 = new Point(350,400);
      Trunk trunk2 = new Trunk(point2,75,300,Color.red);
      trunk2.drawTrunk(g);
	}
}
