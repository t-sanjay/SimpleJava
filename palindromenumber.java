package tcsnqt;

import java.util.Scanner;

public class palindromenumber {

	public static void main(String[] args) {
		// TO check for Palindrome number
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number you want to check for palindrome: ");
		int n = sc.nextInt();
		palindrome(n);
		sc.close();
	}
	public static void palindrome(int n) {
		int temp = n;
		int r, rev = 0;
		while(n>0) {
			r = n%10;
			rev = (rev*10) + r;
			n=n/10;
		}
		if(rev == temp) {
			System.out.println(temp + " is a palindrome.");
		}
		else {
			System.out.println("Not a palindrome.");
		}
	}

}
