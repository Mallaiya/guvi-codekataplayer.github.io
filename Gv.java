package info.gv;
import java.util.*;
public class Gv {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp = n;
		int c = 0,r,sum = 0;
		while(temp>0)
		{
			c++;
			temp /= 10;
			//System.out.println(c);
		}
		temp = n;
		while(temp > 0)
		{
			r = temp % 10;
			sum = sum + pow(r , c);
			//System.out.println(sum);
			temp /= 10;
		}
		System.out.println(sum);
	}
	static int pow(int a, int b)
	{
		int x,p=1;
		for(x=1;x<=b;x++)
		{
			p = p*a;
		}
		return p;
	}
}
