/**
 * Author Atharva Kulkarni Date: 23/12/2023
 */

// Problem Statement-: https://leetcode.com/problems/maximum-score-after-splitting-a-string/description/

public class MaximumScoreSplittingString23rdDecember {

	public static void main(String[] args) {
		String string = "011101";
		System.out.println(maxScore(string));
	}

	static int maxScore(String s) {
		int sumMax = Integer.MIN_VALUE;
		for (int i = 1; i < s.length(); i++) {
			String left = s.substring(0, i);
			String right = s.substring(i);
			int zeros = left.length() - left.replaceAll("0", "").length();
			int ones = right.length() - right.replaceAll("1", "").length();
			int sum = zeros + ones;
			if (sum > sumMax) {
				sumMax = sum;
			}

		}
		return sumMax;
	}

}
