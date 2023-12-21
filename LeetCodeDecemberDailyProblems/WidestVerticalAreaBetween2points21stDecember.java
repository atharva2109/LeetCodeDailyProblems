/**
 * Author Atharva Kulkarni
 * Date: 21/12/2023
 */

// Problem Statement-: https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/description/

import java.util.Arrays;

public class WidestVerticalAreaBetween2points21stDecember {

	public static void main(String[] args) {
		int points[][] = { { 3, 1 }, { 9, 0 }, { 1, 0 }, { 1, 4 }, { 5, 3 }, { 8, 8 } };
		System.out.println(maxWidthOfVerticalArea(points));
	}

	static public int maxWidthOfVerticalArea(int[][] points) {
		Arrays.sort(points, (p1, p2) -> (p1[0] - p2[0])); // sorting only the x coordinates
		int max_diff = Integer.MIN_VALUE;
		for (int i = 0; i < points.length - 1; i++) {
			if (points[i + 1][0] - points[i][0] > max_diff) {
				max_diff = points[i + 1][0] - points[i][0];
			}
		}
		return max_diff;
	}
}
