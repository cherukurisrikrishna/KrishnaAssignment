package collections;

import java.util.ArrayList;

public class ArrayListToArray
{
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Sri");
		al.add("krishna");
		al.add("chowdary");
		al.add("Java");
		al.add("Full");
		al.add("Developer");
		
		System.out.println(al);
		Object strarr[]=al.toArray();
		for(int j=0;j<strarr.length;j++)
		{
			System.out.println(strarr[j]);
		}
	}

}