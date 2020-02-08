import java.util.Scanner;

public class Candies extends Sweets{
	double weight_c[]=new double[10];
	Scanner sc=new Scanner(System.in);
	public void no_candy()
	{
		int no_c;
		System.out.println("Enter No Of Candies:");
		no_c=sc.nextInt();
		for(int i=0;i<no_c;i++)
		{
			System.out.println("Enter Weight Of Candies:");
			weight_c[i]=sc.nextDouble();
		}
		for(int i=0;i<no_c;i++)
		{
			System.out.println("Weight Of Candies is:"+weight_c[i]);
		}
	
	}

}
