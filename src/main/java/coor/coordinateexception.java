package coor;
import java.util.*;
import java.util.logging.Logger;
import java.util.logging.*;
class Coordinate implements cloneable
{
        private double x;
        private double y;
        public Coordinate(double x,double y)
        {
                this.x=x;
                this.y=y;
        }
        public Coordinate()
        {
        }
        public boolean check(double x1,double y1)
        {
			String x11=x1+"";
			String y11=y1+"";
			String x0=x+"";
			String y0=y+"";

               return x0.equals(x11) && y0.equals(y11);
        }
        public Object cloning() throws CloneNotSupportedException
        {
                return super.cloning();
        }
        public static void main(String [] args) throws CloneNotSupportedException
        {
                Scanner sin=new Scanner(System.in);
				Logger l=Logger.getLogger("com.api.jar");
				try
				{
                l.info("Enter x1 coordinate\n");
                double x=sin.nextDouble();
                l.info("Enter y1 coordinate\n");
                double y=sin.nextDouble();
                Coordinate c=new Coordinate(x,y);
                Coordinate c1=(Coordinate)c.cloning();
                l.info("Enter x2 and y2 coordinates\n");
                double x1=sin.nextDouble();
                double y1=sin.nextDouble();
                boolean res=c1.check(x1,y1);
				String output = Boolean.toString(res);
                l.log(Level.INFO,()-> output);
				}
				catch(InputMismatchException e)
				{
					l.log(Level.INFO,()-> "Error Occur :" +e);
				}
				
        }
}
