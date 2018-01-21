package info.guvi;
import java.util.*;
public class SwapEvenOdd {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter letters of 2n letters: ");
		String s = sc.next();
		String []charIndividual = s.split("");
		/*for(int i=0;i<s.length();i++)
		{
			System.out.println(charIndividual[i]);
		}*/
		for(int i=0;i<s.length();i=i+1)
		{
			String temp = charIndividual[i+1];
			charIndividual[i+1] = charIndividual[i];
			charIndividual[i] = temp;
		}
		for(int i=0;i<s.length();i++)
		{
			System.out.print(charIndividual[i]);
		}
	}
}
