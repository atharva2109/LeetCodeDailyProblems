import java.util.Arrays;
/**
 * Author Atharva Kulkarni
 * Date: 1/1/2024
 */

// Problem Statement-: https://leetcode.com/problems/assign-cookies/description/

public class AssignCookies1stJanuary {

	public static void main(String[] args) {
		int g[] = { 10, 9, 8, 7 };
		int s[] = { 5, 6, 7, 8 };
		System.out.println(findContentChildren(g, s));
	}

	static int findContentChildren(int[] g, int[] s) {
		int count = 0;
		Arrays.sort(g);
		Arrays.sort(s);
		int i = 0;
		int j = 0;
		while (i < s.length && j < g.length) {
			if (s[i] >= g[j]) {
				count++;
				j++;
			}
			i++;
		}
		return count;
	}

}
