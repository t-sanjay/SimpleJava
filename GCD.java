
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TO find GCD
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st no: ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd no: ");
		int b = sc.nextInt();
		hcf(a,b);
		sc.close();
	}
	public static void hcf(int a, int b) {
		int hcf = 1;
		for(int i= 1; i<= a && i<=b;i++) {
			if(a%i == 0 && b%i == 0) {
				hcf = i;
			}
		}
		System.out.println("The HCF/GCD is: "+ hcf);
	}

}
