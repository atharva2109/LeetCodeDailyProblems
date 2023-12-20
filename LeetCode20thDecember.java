import java.util.Arrays;

public class LeetCode20thDecember {

	public static void main(String[] args) {
		int img[][] = { { 100, 200, 100 }, { 200, 50, 200 }, { 100, 200, 100 } };
		int res[][] = imageSmoother(img);
		System.out.println(Arrays.deepToString(res));
	}

	static int[][] imageSmoother(int[][] img) {
		int res[][] = new int[img.length][img[0].length];
		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[0].length; j++) {
				int sum = 0;
				int count = 0;
				if (i + 1 < img.length) // south cell
				{
					sum += img[i + 1][j];
					count++;
				}
				if (i - 1 >= 0) { // north cell
					sum += img[i - 1][j];
					count++;
				}
				if (j + 1 < img[0].length) { // east cell
					sum += img[i][j + 1];
					count++;
				}
				if (j - 1 >= 0) { // west cell
					sum += img[i][j - 1];
					count++;
				}
				if (i - 1 >= 0 && j - 1 >= 0) { // north west cell
					sum += img[i - 1][j - 1];
					count++;
				}
				if (i + 1 < img.length && j + 1 < img[0].length) { // south east cell
					sum += img[i + 1][j + 1];
					count++;
				}
				if (i - 1 >= 0 && j + 1 < img[0].length) { // north east cell
					sum += img[i - 1][j + 1];
					count++;
				}
				if (i + 1 < img.length && j - 1 >= 0) { // south west cell
					sum += img[i + 1][j - 1];
					count++;
				}

				sum += img[i][j];
				count++;
				int avg = (int) Math.floor(sum / count);
				res[i][j] = avg;
			}
		}
		return res;
	}

}
