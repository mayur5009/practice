package searchingelement;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lowest = 0, upper = 5, mid, item, f = 0;
		Scanner r = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter array element: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt();
		}
		System.out.println("array element :  ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i]>a[j]) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("sorted array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("enter search element: ");
		item = r.nextInt();
		
		while (lowest <= upper) {
			mid = (lowest + upper) / 2;
			
			//System.out.println(" "+mid);
			
			if (a[mid] == item) {
				f = 1;
				break;
				
			} if (a[mid] < item)  {
				lowest = mid + 1;
			} else {
				upper = mid - 1;
			}
			// System.out.println(" "+mid);
		}
		
		if (f == 1) {
			System.out.println(" found");
		} else {
			System.out.println(" not found");
		}
	}
}
