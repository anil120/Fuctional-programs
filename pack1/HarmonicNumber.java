package pack1;
import java.util.Scanner;
public class HarmonicNumber 
{

	public static void main(String[] args) 
	{
	    double number =1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the interger data");
		double n=s.nextDouble();
		if(n!=0)
		{
			for(double i=2;i<=n;i++)
			{
			number=(number+1/i);
			}
			System.out.print(number+" ");
		}
		else
		{
			System.out.println("invalid number");
		}
		
	}

}
