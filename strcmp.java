/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		boolean flag=true;
		for(int i=0;i<a.length();i++)
		{
			if(a.length()!=b.length())
			{
				flag=false;
				break;
			}
			else if(a.charAt(i)!=b.charAt(i))
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
