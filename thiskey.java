package chandriki2;

public class thiskey {
	public static void main(String args[])
	{
		Abc o1=new Abc();
		Abc o2=new Abc(10,20);
	}

}
class Abc{
	int a;
	int b;
	Abc()
	{		
		a=b=0;
	}
	Abc(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
}
