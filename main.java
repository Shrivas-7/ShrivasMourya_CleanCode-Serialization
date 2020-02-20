import java.io.*;
import java.lang.Math;
interface interest{
	public double principle=0,rate=0,amount=0;
	public int time=0;
	public void get_info()throws IOException;
	public void put_info();
	public void compute_interest();
}
class simple_interest implements interest{
	public double principle=0,rate=0,amount=0;
	public int time=0;
	public void get_info()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Principle");
		principle=Double.parseDouble(br.readLine());	
		System.out.println("Enter the Rate of Interest");
		rate=Double.parseDouble(br.readLine());
		System.out.println("Enter the Time");
		time=Integer.parseInt(br.readLine());
	}
	public void compute_interest()
	{
		amount=(principle*rate*time)/100;
	}
	public void put_info()
	{
		System.out.println("The Simple Intrest is : "+amount);
	}
}
class compound_interest implements interest{
	public double principle=0,rate=0,amount=0;
	int time=0;
	public static double cal(double x,int y)
	{
		double s=1;
		while(y>0)
		{
			s=s*x;
			y--;
		}
		return s;
	}

	public void get_info()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Principle");
		principle=Double.parseDouble(br.readLine());	
		System.out.println("Enter the Rate of Interest");
		rate=Double.parseDouble(br.readLine());
		System.out.println("Enter the Time");
		time=Integer.parseInt(br.readLine());
	}
	public void compute_interest()
	{
		amount=principle*(cal((1-rate/100),time));
	}
	public void put_info()
	{
		System.out.println("The Compound Intrest is : "+amount);
	}
}
class main{
	public static void main(String args[])throws IOException
	{
		System.out.println("Press 1 for calculating Simple Interest  ");
		System.out.println("Press 2 for calculating Compound Interest  ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		switch(n)
		{
			case 1:
				simple_interest a=new simple_interest();
				a.get_info();
				a.compute_interest();
				a.put_info();
				break;
			
			case 2:
				compound_interest b=new compound_interest();
				b.get_info();
				b.compute_interest();
				b.put_info();
				break;
		}
	}
}