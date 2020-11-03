package pw1;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		int[] ar = new int[2];
		ar = calculating();
		if(ar[1]==0) {
			System.out.println("The answer is : " +ar[0]);
		}else {
			System.out.println("The square is : " + ar[0] + " and "+ ar[1]);
		}
	}
	public static int[] calculating() {
		int[] arr = new int[2];
		Scanner s = new Scanner(System.in);
		System.out.print("First integer: ");
		int a = s.nextInt();
		System.out.print("Second integer: ");
		int b = s.nextInt();
		s.close();
		if( a%2!=0 && b%2!=0){
			int mult = a * b;
			arr[0] = mult;
			return arr;
		}else if (a % 2 == 0 && b % 2 == 0) {
			int sum = a + b;
			arr[0] = sum;
			return arr;
		}else{
			int x = a * a;
			int y = b * b;
			arr[0] = x;
			arr[1] = y;
			return arr;
		}
	}
}
