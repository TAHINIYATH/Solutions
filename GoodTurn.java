

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i;
		Codechef cc= new Codechef();
		Scanner sc= new Scanner(System.in);
	   int n=	sc.nextInt();//test cases
		while(n!=0)
		{
		      int x	=sc.nextInt();
		      int y=sc.nextInt();
		      if(x+y>6)
		      System.out.println("YES");
		      else
		      System.out.println("No");
		      n--;
		}
	}
}
