import java.util.Scanner;

public class Sweets extends ChildGift {
	Scanner sc=new Scanner(System.in);
	public void no_sweet()
	{int ch;
	
		do {
			System.out.println("Enter Which Sweet:1.Chocolate\n2.Candy\n3.Exit");
			
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				ChildGift cg=new ChildGift();
				Chocolate c1=new Chocolate();
				c1.no_choc();
				break;
			case 2:
				Candies c2=new Candies();
				c2.no_candy();
				break;
			case 3:
				break;
			default:
				break;
			}
		}while(ch!=3);
	
	}

}
