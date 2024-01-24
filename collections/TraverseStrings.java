package collections;

import java.util.ArrayList;

public class TraverseStrings 
{
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Sri krishna");
		al.add("chowdary");
		al.add("cherukuri");
		al.add("Java");
		al.add("Full");
		al.add("Developer");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("Using Enhanced For Loop");
		
		for(String str:al)
		{
			System.out.println(str);
		}
	}

}
