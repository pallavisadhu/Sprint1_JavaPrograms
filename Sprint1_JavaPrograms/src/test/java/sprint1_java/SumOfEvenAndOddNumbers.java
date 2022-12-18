package sprint1_java;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfEvenAndOddNumbers {
	
	public ArrayList<Integer> findSum(int n) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int r,oddSum=0,evenSum=0;
		while(n>0) {
			r=n%10;
			if(r%2==0) {
				evenSum = evenSum + r;
			}else {
				oddSum = oddSum + r;
			}
			n = n /10;
		}
		al.add(evenSum);
		al.add(oddSum);
		System.out.println(al);
		return al;
	}
	
	
	
	
	@Test
	public void testCase1() {
		int n = 13245;
		ArrayList<Integer> actual = findSum(n);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(6);
		expected.add(9);

		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void testCase2() {
		int n = 222;
		ArrayList<Integer> actual = findSum(n);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(6);
		expected.add(0);
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void testCase3() {
		int n = 1111;
		ArrayList<Integer> actual = findSum(n);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(4);
		Assert.assertEquals(actual, expected);
	}



}
