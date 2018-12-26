package pack1;
import java.util.Scanner;

public class Replace 
{
	public static void main(String[] args) 
	{
      Scanner s = new Scanner(System.in);
      String s1 = "hello username , how are you?";
      System.out.println("enter string data");
      String s2 = s.next();
      if(s2.length()>=3)
      {
    	  System.out.println(s1.replace("username",s2));
      }
      else
      {
    	  System.out.println("invalid data");
      }
	}

}
