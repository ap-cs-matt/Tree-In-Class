
/**
 * The Point class creates a Point object with the given x- and y coordinates or (0,0) by default.
 * 
 * @author Mr. Chetlen
 * @version Decemeber 2014
 */
// Java1002.java
// The <Point> class is improved with a second "overloaded" constructor.


public class PointRunner
{
    public static void main(String[] args)
    {
      Point point1 = new Point();
      System.out.println("Point1 at (" + point1.getX() + "," + point1.getY() + ")");

      //Point point2 = new Point(500,300);
     // System.out.println("Point2 at (" + point2.getX() + "," + point2.getY() + ")");
    }
}


class Point
{
   private int x;
   private int y;

   public Point()
   {
      x = 0;
      y = 0;
   }

   //Add the overloaded Point constructor method here.

   public int getX()
   {
      return x;
   }

   public int getY()
   {
      return y;
   }

   
   // Add setX and setY methods here.
}
