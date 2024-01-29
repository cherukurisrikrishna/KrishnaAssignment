package sets;

import java.util.*;

public class ImplementHashSet
{
	public static void main(String[] args) {
		
		HashSet<String> h1 = new HashSet<String>();
		h1.add("Sri krishna");
		h1.add("cherukuri");
		h1.add("chowdary");
		h1.add("durga");
		h1.add("prasad");
		h1.add("cherukuri");
		h1.add("udaya");
		h1.add("lakshmi");
		h1.add("cherukuri");
		h1.add("roopa");
		System.out.println(h1);
		Iterator itr = h1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		for(String s:h1)
		{
			System.out.println(s);
		}
		
		String[] sarr = h1.toArray(new String[h1.size()]);
		for(int i=0;i<sarr.length;i++)
		{
			System.out.println(sarr[i]);
		}
		
	}

}