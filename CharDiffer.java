package info.gv;
import java.util.*;
public class CharDiffer {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next().toLowerCase();
		String s2 = sc.next().toLowerCase();
		int len1 = s1.length();
		int len2 = s2.length();
		int n = len2;
		// System.out.println(n);
		int crt = 0;
		int wrong = 0;
		if(len1 == len2)
		{
			for(int i=0;i<n;i++)
			{
				//System.out.println(s1.charAt(i));
				//System.out.println(s2.charAt(i));
				if((s1.charAt(i))==(s2.charAt(i)))
				{
					
					//System.out.println("i"+i);
					crt++;
					//System.out.println("crt"+crt);
				}
				else
				{
					
					wrong++;
					//System.out.println("wrg"+wrong);
				}
			}
			if(wrong>1)
			{
				System.out.println("No");
			}
			else
			{
				System.out.println("Yes");
			}
			
		}
		else
		{
			System.out.println("Enter Same Length String");
		}
		
	}
}
