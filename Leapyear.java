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
		   
	       if(yr%4 == 0)
	       {
	           System.out.print("This is a Leap Year");
	       }
	       else
	       {
	           System.out.print("This is not a Leap Year");
	       }
	    }
	}