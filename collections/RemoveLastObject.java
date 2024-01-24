package collections;

import java.util.ArrayList;

public class RemoveLastObject
{
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Sri");
		al.add("krishna");
		al.add("Chowdary");
		al.add("Java");
		al.add("Full");
		al.add("Developer");
		System.out.println("Before Removal");
		System.out.println(al);
		
		int lastIndex = al.size()-1;
		al.remove(lastIndex);
		System.out.println("After Removal");
		System.out.println(al);
		
		
	}

}
