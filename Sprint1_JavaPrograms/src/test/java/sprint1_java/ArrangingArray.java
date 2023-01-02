package sprint1_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class ArrangingArray {
	int j=0;
	double result;
	HashMap<List<Integer>, Double> hmap = new HashMap<List<Integer>, Double>();
	

	public void arrangeArray(int a[], int size, int n) {
		
		int[] p;
		
		if (size == 1)  {
			List<Integer> list = new ArrayList<Integer>();
			//printPermutations(a, n);
			for (int i = 0; i < n; i++)  {
				System.out.print(a[i] + " ");
			}
			double r = Math.pow(a[2], a[1]);
			result = Math.pow(r,a[0]);
			list.add(a[0]);
			list.add(a[1]);
			list.add(a[2]);
			hmap.put(list, result);
			System.out.println(hmap);			    
		}
		
		

		for (int i = 0; i < size; i++)   
		{  
			arrangeArray(a, size - 1, n);  
			if (size % 2 == 1)   
			{  
				int temp = a[0];  
				a[0] = a[size - 1];  
				a[size - 1] = temp;  
			}  
			else   
			{  
				int temp;  
				temp = a[i];  
				a[i] = a[size - 1];  
				a[size - 1] = temp;  
			}  
		}  

	}




	@Test
	public void testCase1() {
		int a[]= {1,2,3};
		arrangeArray(a,a.length,a.length);
        TreeMap<Double, List<Integer>> tree = new TreeMap<Double, List<Integer>>();
        
		for (Map.Entry<List<Integer>, Double> entry : hmap.entrySet()) {
            tree.put(entry.getValue(), entry.getKey());
        }
		
		System.out.println("Final Tree" + tree);
		System.out.println("Final Tree" + tree.lastKey());

		for (Map.Entry<List<Integer>, Double> entry : hmap.entrySet()) {
            if(entry.getValue().equals(tree.lastKey())) {
            	System.out.println(entry.getKey());
            }
        }		

	}

}

