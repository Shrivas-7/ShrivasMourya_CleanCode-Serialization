import java.io.*;
class construction{
	double cost,area;
	void construction_cost()throws IOException
	{
		System.out.println("Enter the area in sq. feet : ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		area=Double.parseDouble(br.readLine());
		int n;
		System.out.println("Press 1 for the use of standard material ");
		System.out.println("Press 2 for the use of above standard material ");
		System.out.println("Press 3 for the use of high standard material ");
		System.out.println("Press 4 for the use of high standard material and fully automated home");
		n=Integer.parseInt(br.readLine());
		if(n==1)
			cost=1200*area;
		else if(n==2)
			cost=1500*area;
		else if(n==3)
			cost=1800*area;
		else if(n==4)
			cost=2500*area;
		System.out.println("The cost of construction is : INR "+cost);
	}
}
class main2{
	public static void main(String args[])throws IOException
	{
		construction a = new construction();
		a.construction_cost();
	}
}