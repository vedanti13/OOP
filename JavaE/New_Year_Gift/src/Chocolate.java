
import java.io.*;
import java.util.*;
public class Chocolate extends Sweets{
	double weight[]=new double[10];
	Scanner sc=new Scanner(System.in);
	public void no_choc()
	{
		int no;
		System.out.println("Enter No Of Chocolates:");
		no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter Weight Of Chocolates:");
			weight[i]=sc.nextDouble();
		}
		for(int i=0;i<no;i++) {
			System.out.println("Weight of Chocolate is:"+weight[i]);
		}
	}
	

}
