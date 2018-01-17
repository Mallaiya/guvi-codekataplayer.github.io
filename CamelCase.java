package info.gv;
import java.util.*;
public class CamelCase {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int i = 0;
		String name = s.nextLine();
		// System.out.println(name);
		int n = name.length();
		// System.out.println(n);
		for(i = 0;i<n;i++)
		{
			if(i==0)
			{
				char upper = name.toUpperCase().charAt(0);
				System.out.print(upper);
			}
			
			else if(Character.isWhitespace(name.charAt(i)))
			{
				System.out.print(" ");
				System.out.print(name.toUpperCase().charAt(i+1));
				i++;
			}			
			else
			{
				char lower = name.toLowerCase().charAt(i);
				System.out.print(lower);
			}
		}	
	}
}

