package pack1;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("prime no. between 0 to 1000 are");
		for(int i=0;i<=1000;i++)
		{
			int temp =0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					temp+=1;
				}
			}
		    if(temp==0)
		    {
		    	System.out.println(i+"  ");
		    }
		  
		}
	}

}
