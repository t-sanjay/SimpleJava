package tcsnqt;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TO check for Armstrong number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no to check for armstrong");
		int a = sc.nextInt();
		arm(a);
		sc.close();
	}

	public static void arm(int n) {
		int sum=0;
		int temp = n;
		while(n>0) {
			int a = n%10;
			n = n/10;
			sum = sum+(a*a*a);
		}
		if(temp == sum) {
			System.out.println(temp + " is  a Armstrong number.");
		}
		else {
			System.out.println("Not an Armstrong number");
		}
	}
}
