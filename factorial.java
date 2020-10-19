package tcsnqt;

import java.util.Scanner;

public abstract class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find factorial:");
		int  n = sc.nextInt();
		int res = factorial1(n);
		System.out.println("Factorial is "+ res);
		sc.close();
	}
	// using for loop
	/* public static void factorial1(int n) {
		int res = 1;
		for(int i=1;i<=n;i++) {
			res = res*i;
		}
		System.out.println("Factorial value is: "+ res);
	} */
	// using recursion
	public static int factorial1(int n) {
		int res = 1;
		while(n>1) {
			res= res*n;
			n--;
			factorial1(n);
		}
		return res;
	}

}
