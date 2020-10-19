package tcsnqt;

import java.util.*;

public class leapyear {

	public static void main(String[] args) {
		// TO find leap year or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		ly(year);
		sc.close();
	}
	public static void ly(int y) {
		if((y%4==0 && y%100 != 0) || (y%400 == 0)) {
			System.out.println("Year is a leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}
