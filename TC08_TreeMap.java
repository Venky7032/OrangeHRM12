package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;


public class TC08_TreeMap {

	public static void main(String[] args) {
		
	
		
		Map<Integer,String> s2=new TreeMap<Integer,String>();
		s2.put(10,"Kiran");
		s2.put(20,"Ravi");
		s2.put(30,"Venkat");
		s2.put(40,"Venkat");
		s2.put(40,"Meghana");
		s2.put(5,"Lakshmi");
		System.out.println(s2);
	}

}
