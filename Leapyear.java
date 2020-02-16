 	import java.util.Scanner;

	public class Leapyear
	{
	    public static void main(String args[])
	    {
	       int yr;
	       @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		   
	       System.out.print("Enter Year : ");
	       yr = sc.nextInt();
		   
	       if((yr%4 == 0) && (yr%100!=0))
	       {
	           System.out.print("This is a Leap Year");
	       }
	       else if((yr%100 == 0) && (yr%400 == 0))
	       {
	           System.out.print("This is a Leap Year");
	       }
	       else if(yr%400 == 0)
	       {
	           System.out.print("This is a Leap Year");
	       }
	       else
	       {
	           System.out.print("This is not a Leap Year");
	       }
	    }
	}