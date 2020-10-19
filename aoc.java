package tcsnqt;

import java.util.*;

public class aoc {

	public static void main(String[] args) {
		// TO find area of circle
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double r = sc.nextInt();
		area(r);
		sc.close();

	}
	public static void area(double r) {
	 double area = 3.14*r*r;
	 System.out.println("Area of circle is: "+ area);
		
	}

}
