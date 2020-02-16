
public class Complexno
{
	int Real,Imag;
	
Complexno()
	{
	
	}

Complexno(int Real1,int Imag1)
	{
		Real=Real1;
		Imag=Imag1;
	}

Complexno AddComplexno(Complexno C1,Complexno C2)
	{
		Complexno CSum=new Complexno();
		CSum.Real=C1.Real+C2.Real;
		CSum.Imag=C1.Imag+C2.Imag;
		return CSum;
	}

public static void main(String[] a)
	{
		Complexno C1=new Complexno(4,8);
		Complexno C2=new Complexno(5,7);
		Complexno C3=new Complexno();
		C3=C3.AddComplexno(C1,C2);
		System.out.println("SUM:" + C3.Real +"+i" + C3.Imag);
	}
}