package pack1;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter int data");
		int a = s.nextInt();
		int length = String.valueOf(a).length();
		if((a%4==0) && (length==4))
		{
			System.out.println(a+ " is a leap year");
		}
		else
		{
			System.out.println(a +" is not a leap year");
		}
		
	}

}
