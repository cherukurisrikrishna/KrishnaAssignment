package strings;


import java.util.*;

public class Vowels 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int vowelcount=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowelcount++;
			}
		}
		System.out.println(vowelcount);
	}
	

}