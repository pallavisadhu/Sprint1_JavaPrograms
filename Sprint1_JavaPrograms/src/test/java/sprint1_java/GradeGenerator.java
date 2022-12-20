package sprint1_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GradeGenerator {
	public Map<String, Integer> finalGrade(Map<String,Integer> original, Map<String, Integer> makeUp) {
		
		Map<String, Integer> finalScore = new HashMap<String,Integer>();
		
		for(Entry<String, Integer> entry1 : original.entrySet()) {
			for(Entry<String, Integer> entry2 : makeUp.entrySet()) {
				if(entry1.getValue() < entry2.getValue()) {
					finalScore.put(entry2.getKey(), entry2.getValue());
				}else {
					finalScore.put(entry1.getKey(), entry1.getValue());

				}
			}
		}
		
		System.out.println(finalScore);
		return finalScore;
		
	}

	private Map<String, Integer> getMakeupGrades() {
		Map<String, Integer> makeUp = new HashMap<String, Integer>();
		makeUp.put("Tom", 90);
		makeUp.put("Liz", 50);
		makeUp.put("Steve", 70);
		return makeUp;

	}

	private Map<String, Integer> getOriginalGrades() {
		Map<String, Integer> original = new HashMap<String, Integer>();
		original.put("Tom", 50);
		original.put("Liz", 80);
		original.put("Steve", 30);
		return original;

	}

	@Test
	public void testCase1() {
		Map<String, Integer> original = getOriginalGrades();
		Map<String, Integer> makeUp = getMakeupGrades();
		
		Map<String, Integer> actual = finalGrade(original,makeUp);
		Map<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("Tom", 90);
		expected.put("Steve", 70);
		expected.put("Liz", 80);

		Assert.assertEquals(actual,expected);
	}

	

}
