package arrays;
import java.util.Scanner;

public class MirrorMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		int a[][] = new int[2][2];
		System.out.println("enter matrix element");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = r.nextInt();
			}
		}
		System.out.println("Matrix: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Mirror Matrix : ");
		for (int i = 0; i < 2; i++) {
			for (int j = 1; j >= 0; j--) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
