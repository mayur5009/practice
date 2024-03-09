package sortingelement;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner r=new Scanner(System.in);
		System.out.println("enter size of element: ");
		n= r.nextInt();
		int a[]=new int[n];
		System.out.println("enter array element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=r.nextInt();
		}
		System.out.println("array element: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0; i<n-1;i++) {
			int m= a[i];
			int loc=i+1;
			for(int j=i+1;j<n;j++) {
				if(m>a[j]) {
					m=a[j];
					loc=j;
				}
			}
			if(a[loc]<a[i]) {
				int temp=a[loc];
				a[loc]=a[i];
				a[i]=temp;
			}
		}
		System.out.println("\n selection sort array result:  ");
		for (int i=0 ; i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
