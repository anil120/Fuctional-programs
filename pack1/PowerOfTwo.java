package pack1;
import java.util.Scanner;
public class PowerOfTwo 
{
	public static void main(String[] args) 
	{
       int number =2;
       Scanner s = new Scanner(System.in);
       System.out.println("enter the power value");
       int n=s.nextInt();
       if((n>=0) && (n<31))
       {
    	   for(int i=0;i<=n;i++)
    	   {
    		   System.out.print(number+" ");
    		   number*=2;
    	   }
       }
       else
       {
    	   System.out.println("invalid power number");
       }
	}

}
