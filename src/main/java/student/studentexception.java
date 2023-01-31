package student;
import java.util.*;
import java.util.logging.Logger;
import java.util.logging.*;
class Student
{
        private String name;
        private String grade;
        private double gpa;
        public Student()
        {
        }
		Logger l=Logger.getLogger("com.api.jar");
        public Student(String name,String grade,double gpa)
        {
                this.name=name;
                this.grade=grade;
                this.gpa=gpa;
        }
        public double updateGPA(double newgpa)
        {
                this.gpa=newgpa;
                return this.gpa;
        }
        public void display()
        {
                l.log(Level.INFO,()-> "\nStudent name: "+name+"\nGrade: "+grade+"\nCurrent GPA: "+gpa);
        }
        public static void main(String ...args)
        {
                Scanner sin=new Scanner(System.in);
				Logger l=Logger.getLogger("com.api.jar");
				try
				{
                l.info("Enter name\n");
                String name=sin.next();
                l.info("Enter grade\n");
                String grade=sin.next();
                l.info("Enter GPA\n");
                double gpa=sin.nextDouble();
                Student s=new Student(name,grade,gpa);
                s.display();
                l.info("\nEnter the GPA to update\n");
                double newgpa=sin.nextDouble();
                s.updateGPA(newgpa);
				
                s.display();
                l.log(Level.INFO,()-> "\n"+name+" has a "+s.updateGPA(newgpa)+" GPA");
				}
				catch(InputMismatchException e)
				{
					l.log(Level.INFO,()-> "Error Occur :" +e);
				}
        }
}