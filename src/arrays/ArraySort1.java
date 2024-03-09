package arrays;
import java.util.Scanner;

public class ArraySort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[5];
		Scanner r = new Scanner(System.in);
		System.out.print("enter array element ");
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt();
		}
		System.out.println("array element :  ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		System.out.println("sortelisted array element : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
