package tcsnqt;

import java.util.Scanner;

public class primerange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prime number yes or no
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the upper limit for range of prime numbers: ");
				int n = sc.nextInt();
				p(n);
				sc.close();
			}
			public static void p(int n) {
				while(1 < n) {
				boolean val = true;
				for(int i=2;i<=(n/2); i++) {
					if(n %i == 0) {
						val = false;
						break;
					}
				}
				if(val) {
					System.out.print(n+ ",");
				}
				--n;
			}
				System.out.print("1");	
	}

}
