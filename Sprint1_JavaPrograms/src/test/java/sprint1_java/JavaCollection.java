package sprint1_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

public class JavaCollection {
	
	public void method1() {
		HashMap<String,List<String>> hmap = new HashMap<String,List<String>>();
		List<String> list = new ArrayList<String>();
		hmap.put("fruit",list);
		hmap.get("fruit").add("apple");
		hmap.get("fruit").add("mango");
		System.out.println(hmap);
		
	}
	
	
	
	
	@Test
	public void testCase1() {
		method1();
	}

}
