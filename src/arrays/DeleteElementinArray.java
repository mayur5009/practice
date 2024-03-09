package arrays;
import java.util.Scanner;

public class DeleteElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loc,size;
		Scanner r = new Scanner(System.in);
		System.out.println("enter size of array: ");
		size=r.nextInt();
		int a[]=new int[size];
		System.out.println("enter array value: ");
		for(int i=0;i<size;i++) {
		a[i]=r.nextInt();
		}
		System.out.println("enter location :  ");
		loc=r.nextInt();
		for(int i=loc; i<size-1;i++) {
			a[i]=a[i+1];
		}
		size--;
		for(int i=0;i<size;i++) {
			System.out.println(a[i]+ " ");
		}
	}

}
