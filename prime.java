package tcsnqt;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// Prime number yes or no
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check for prime: ");
		int n = sc.nextInt();
		p(n);
		sc.close();
	}
	public static void p(int n) {
		boolean val = false;
		for(int i=2;i<=(n/2); i++) {
			if(n %i == 0) {
				val = false;
				break;
			}
			else {
				val = true;
			}
		}
		if(val) {
			System.out.println(n + " is  a prime number");
		}
		else {
			System.out.println(n + " is not a prime number.");
		}
	}

}
