package sprint1_java;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringAnagram {

	public ArrayList<Integer> findAnagram(String str, String ptr) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		int plen = ptr.length();

		if (isUpperCase(str) && isUpperCase(ptr) && str.length() >= plen) {

			for (int i = 0; i <= str.length() - plen; i++) {
				String sub = str.substring(i, i + plen);
				System.out.println("sub:" + sub + " i:" + i + " plen:" + plen);
				boolean b = checkAnagram(sub, ptr);
				System.out.println("res:" + b);
				if (b == true) {
					System.out.println(i);
					al.add(i);
				}
			}
		}
		return al;
	}

	public boolean isUpperCase(String str) {
		char[] a = str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (!Character.isUpperCase(a[i]))
				return false;
		}
		return true;
	}

	public boolean checkAnagram(String str1, String ptr) {

		char[] parray = ptr.toCharArray();
		char[] sarray = str1.toCharArray();

		Arrays.sort(parray);
		Arrays.sort(sarray);

		boolean r = Arrays.equals(parray, sarray);
		return r;

	}

	@Test
	public void testCase1() {
		String str = "ABABABA", ptr = "A";
		ArrayList<Integer> output = findAnagram(str, ptr);
		System.out.println(output);
		Assert.assertTrue(output.size() == 4);

	}

	@Test
	public void testCase2() {
		String str = "AFDSA", ptr = "AFAFAFAFAF";
		ArrayList<Integer> output = findAnagram(str, ptr);
		System.out.println(output);
		Assert.assertTrue(output.size() == 0);
		;

	}

	@Test
	public void testCase3() {
		String str = "sjfkdsjdj", ptr = "j";
		ArrayList<Integer> output = findAnagram(str, ptr);
		System.out.println(output);
		Assert.assertTrue(output.size() == 0);
		;

	}

	@Test
	public void testCase4() {
		String str = "AFEE", ptr = "FEEFEEFEE";
		ArrayList<Integer> output = findAnagram(str, ptr);
		System.out.println(output);
		Assert.assertTrue(output.size() == 0);
		;

	}

}
