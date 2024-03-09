package searchingelement;

import java.util.Scanner;

public class LinearSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0;
		int a[] = { 12, 20, 30, 40, 50, 60 };
		Scanner r = new Scanner(System.in);
		System.out.println("enter value: ");
		int b = r.nextInt();
		int i = 0;
		while (i < 6) {
			if (a[i] == b) {
				System.out.println("you enter : " + b + " is found in position: " + i);
			 f=1;
			} 				
			++i;			
		}
		if(f==1) {
			System.out.println("found!!!!!!!!!!!!!!!!!");
		}else {
			System.out.println("not found!!!!!!!!!!!!!!!!!!");
		}
	}
}
