package arrays;
import java.util.Scanner;

public class TransposeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		int a[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = r.nextInt();
			}
			System.out.println();
		}System.out.println("Normal matrix: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}System.out.println("Transpose matrix: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}

}
