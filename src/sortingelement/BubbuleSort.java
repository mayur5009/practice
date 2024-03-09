package sortingelement;

import java.util.Scanner;

public class BubbuleSort {

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
		for(int i=a.length;i>0;i--) {
			for(int j=0;j<i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("sorted array element: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
