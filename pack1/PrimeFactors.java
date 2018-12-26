package pack1;
import java.util.Scanner;
public class PrimeFactors
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter data");
		int n =s.nextInt();
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
		}
	}

}
