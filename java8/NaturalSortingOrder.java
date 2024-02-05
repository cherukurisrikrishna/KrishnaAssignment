package java8;

import java.util.*;
import java.util.stream.Collectors;

public class NaturalSortingOrder {
	
	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		str.add("sri ");
		str.add("krishna");
		str.add("cherukuri");
		str.add("Java");
		str.add("Full");
		str.add("Stack");
		str.add("Developer");
		
		
		List<String> finallist = str.stream().sorted().collect(Collectors.toList());
		System.out.println(finallist);
		
		
	}

	
	
	
	
}