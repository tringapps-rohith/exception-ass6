package credit;
import java.util.*;
import java.util.logging.Logger;
import java.util.logging.*;
class Credit implements cloneable
{
        private String name;
        private long no;
        private String expdate;
        public Credit(String name,long no,String expdate)
        {
                this.name=name;
                this.no=no;
                this.expdate=expdate;
        }
        public Credit()
        {
        }
        public boolean equals(long no1)
        {
				String no0=no+"";
				String no01=no1+"";
                return no0.equals(no01);
        }
        public Object cloning() throws CloneNotSupportedException
        {
                return super.cloning();
        }
        public static void main(String [] args) throws CloneNotSupportedException
        {
                Scanner sin=new Scanner(System.in);
				Logger l=Logger.getLogger("com.api.jar");
				try{
                l.info("Enter card holders name\n");
                String name=sin.next();
                l.info("Enter card no\n");
                long no=sin.nextLong();
                l.info("Enter expiry date\n");
                String expdate=sin.next();
                Credit c=new Credit(name,no,expdate);
                Credit c1=(Credit)c.cloning();
                l.info("Enter the card no to check by equals method\n");
                long no1=sin.nextLong();
                l.log(Level.INFO,()-> Boolean.toString(c1.equals(no1)));
				}
				catch(InputMismatchException e)
				{
					l.log(Level.INFO,()-> "Error :"+e);
				}
        }
}
