package pack1;
import java.util.Scanner;
public class Anagaram
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int temp= 0;
		System.out.println("enter first string");
		String s1= s.next();
		System.out.println("enter second string");
		String s2=s.next();
		String s3 = s1.toUpperCase();
		String s4 = s2.toUpperCase();
		if(s1.length()==s2.length())
		{
			for(int i= 0;i<=s3.length()-1;i++)
			{
				for(int j=0;j<=s4.length()-1;j++)
				{
					if(s3.charAt(i)==s4.charAt(j))
					{
						temp++;
						break;
					}
				}
			}
			if(temp==s1.length())
			{
				System.out.println(s1+" is a anagram of " + s2);
			}
			else
			{
				System.out.println(s1 +" is not a anagram of" + s2);
			}
		}
		else
		{
			System.out.println(s1+" is not a anagram of"+ s2);
		}
	}

}
