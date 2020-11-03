package pw1;
import java.util.Arrays;
public class Exercise2 {
	public static int Min(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static int Find(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}
	public static int sumArray(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum;
	}
	public static void printArray(int[] array) {
		System.out.print("Printing: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	public static int[] reverseArray(int[] array) {
		int n = array.length;
		int[] arr = new int[n];
		for (int i = 0; i < array.length; i++) {
			arr[i] = array[array.length - 1 - i];
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] list = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Min is: " + Min(list));
		System.out.println("Find is: " + Find(list, 3));
		System.out.println("Sum of all : " + sumArray(list));
		printArray(list);
		System.out.println("\nReversed array is: "+Arrays.toString(reverseArray(list)));
	}
}
