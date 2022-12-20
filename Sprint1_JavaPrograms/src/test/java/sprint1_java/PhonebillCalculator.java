package sprint1_java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PhonebillCalculator {
	
	public double calculateBill(double planFee, int min) {
		
		double f = calculateOverageFees(min);
		System.out.println("Overage fee:"+f);
		
		double t = calculateTax(f);
		System.out.println("Tax:"+t);

		double totalBill = calculateFinalBill(planFee,t,f);
		System.out.println("Final Bill:"+totalBill);
		return totalBill;
	}
	
	
	
	
	private double calculateFinalBill(double planFee, double t,double f) {
		
		double total = planFee + t +f;
		return total;
		
	}




	private double calculateTax(double f) {
		double tax = f * 0.15;
		return tax;
	}




	private double calculateOverageFees(int min) {
		
		double fee = min * 0.25;
		return fee;
		
	}




	@Test
	public void testCase1() {
		double planFee = 100;
		int min=50;
		double output = calculateBill(planFee,min);
		Assert.assertEquals(output, 114.375);
	}
	
	@Test
	public void testCase2() {
		double planFee = 100;
		int min=0;
		double output = calculateBill(planFee,min);
		Assert.assertEquals(output, 100);
	}

}
