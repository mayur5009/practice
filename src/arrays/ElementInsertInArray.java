package arrays;
import java.util.Scanner;

public class ElementInsertInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size, loc, item;
		Scanner r = new Scanner(System.in);
		System.out.println("enter size of array: ");
		size = r.nextInt();
		int a[] = new int[size + 1];
		System.out.println("enter element in array");
		for (int i = 0; i < size; i++) {
			a[i] = r.nextInt();
		}
		System.out.println("enter location you want to insert the value: ");
		loc = r.nextInt();
		System.out.println("enter you value:  ");
		item = r.nextInt();
		for (int i = size; i > loc; i--) {
			a[i] = a[i - 1];
		}
		a[loc] = item;
		size++;
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" \n " + a.length + " ");
	}

}
