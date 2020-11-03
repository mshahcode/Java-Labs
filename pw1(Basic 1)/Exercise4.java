package pw1;
import java.util.Scanner;
public class Exercise4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Give integers succesively: ");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Choose an operation : \n1. +\n2. -\n3. *\n4. /\n5. %");
		System.out.print("Operation : ");
		int operation = s.nextInt();
		operationscal(a,b,operation);
		s.close();
	}
	public static void operationscal(int a, int b, int operation) {
		switch (operation) {
			case 1:
				int sum = a + b;
				System.out.println("Output : " + a+ " + "+ b + " = " + sum);
				break;
			case 2:
				int sub = a - b;
				System.out.println("Output : " + a+ " - "+ b + " = " + sub);
				break;
			case 3:
				int mult = a * b;
				System.out.println("Output : " + a+ " * "+ b + " = " + mult);
				break;
			case 4:
				if (b == 0) {
					System.out.println("Impossible to divite to 0 !!");
					break;
				}
				int division = a / b;
				System.out.println("Output : " + a+ " / "+ b + " = " + division);
				break;
			case 5:
				int x = a % b;
				System.out.println("Output : " + a+ " % "+ b + " = " + x);
				break;
			default:
				System.out.println("Invalid operation!!!");
				break;
		}
	}
}
