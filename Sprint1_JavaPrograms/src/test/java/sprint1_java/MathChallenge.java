package sprint1_java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathChallenge {

	public int mathChallenge(String s) {

		String[] sarray = s.split(" ");
		String operand1, operand2, operator, resultant, e = null;
		int res = 0;

		operand1 = sarray[0];
		operator = sarray[1];
		operand2 = sarray[2];
		resultant = sarray[4];

		if (resultant.contains("x")) {
			e = resultant;
			if (operator.equals("+"))
				res = Integer.parseInt(operand1) + Integer.parseInt(operand2);
			else if (operator.equals("-"))
				res = Integer.parseInt(operand1) - Integer.parseInt(operand2);

			else if (operator.equals("*"))
				res = Integer.parseInt(operand1) * Integer.parseInt(operand2);

			else
				res = Integer.parseInt(operand1) / Integer.parseInt(operand2);

		} else if (operand1.contains("x")) {
			e = operand1;
			if (operator.equals("+"))
				res = Integer.parseInt(resultant) - Integer.parseInt(operand2);
			else if (operator.equals("-"))
				res = Integer.parseInt(resultant) + Integer.parseInt(operand2);

			else if (operator.equals("*"))
				res = Integer.parseInt(resultant) / Integer.parseInt(operand2);

			else
				res = Integer.parseInt(resultant) * Integer.parseInt(operand2);

		} else if (operand2.contains("x")) {
			e = operand2;
			if (operator.equals("+"))
				res = Integer.parseInt(resultant) - Integer.parseInt(operand1);
			else if (operator.equals("-"))
				res = Integer.parseInt(resultant) + Integer.parseInt(operand1);

			else if (operator.equals("*"))
				res = Integer.parseInt(resultant) / Integer.parseInt(operand1);

			else
				res = Integer.parseInt(resultant) * Integer.parseInt(operand1);

		}
		char[] s1 = String.valueOf(res).toCharArray();
		char[] e1 = e.toCharArray();
		int k = 0;
		char result = 0;
		for (char i : e1) {
			if (i == 'x') {
				result = s1[k];
				break;
			} else {
				k = k + 1;
			}
		}
		return Character.getNumericValue(result);
	}

	@Test
	public void testCase1() {
		String s = "1x0 * 12 = 1200";
		int output = mathChallenge(s);
		Assert.assertEquals(output, 0);
	}
	@Test
	public void testCase2() {
		String s = "3x + 12 = 46";
		int output = mathChallenge(s);
		Assert.assertEquals(output, 4);
	}
	
	@Test
	public void testCase3() {
		String s = "4 - 2 = x";
		int output = mathChallenge(s);
		Assert.assertEquals(output, 2);
	}

}
