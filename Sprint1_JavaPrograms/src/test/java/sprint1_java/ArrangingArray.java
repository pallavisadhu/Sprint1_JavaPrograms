package sprint1_java;

import org.testng.annotations.Test;

public class ArrangingArray {
	
	public void arrangeArray(int a[]) {
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	
	
	@Test
	public void testCase1() {
		int a[]= {5,4,6};
		arrangeArray(a);
	}

}
