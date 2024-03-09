package sortingelement;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		System.out.println("enter array size : ");
		int n = r.nextInt();
		int a[] = new int[n];
		System.out.println("enter array value: ");
		for(int i=0;i<n;i++) {
			a[i]=r.nextInt();
		}
		System.out.println("array :");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		for (int i=1;i<n;i++) {
			for(int j=i;j>=1;j--) {
				if(a[j-1]>a[j]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("inserting array sorting: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
