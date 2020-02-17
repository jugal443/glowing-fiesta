import java.util.*;
public class Allinone
{
	public static void main(String[] args) 
	{
		Encap e=new Encap();
		System.out.println("for Encap class");
		e.Add(2,3); //addition of two integers
		e.Add(2.3f,2.7f); // addition of two floats
		
		Over o=new Over();
		System.out.println("for Over which is inherited from Encap class");
		o.Add(2,3); // multiplication of two integers
		
		Int i=new Int();// constructor created, object Instantiation
		i.run();
		i.walk();
	}
}



class Encap
{
    public void Add(int a,int b)
    {
        int c=a+b;
        System.out.println("ths int sum "+c);
    }
    public void Add(float a,float b)// Overload
    {
        float c=a+b;
        System.out.println("ths float sum "+c);
    }
}



class Over extends Encap
{
    public void Add(int a,int b)// Override
    {
        int c=a*b;
        System.out.println("the in mull override "+c);
    }
}
interface Abs// Interface
{
    void run();
    void walk();
}


class Int implements Abs
{
    public void run()
    {
        System.out.println("the system is running ");
    }
    public void walk()
    {
        System.out.println("the system is walking ");
    }
}
