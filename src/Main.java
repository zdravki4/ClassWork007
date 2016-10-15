import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		sum(a, b);
		int sumata = sumReturn(a, b);
		System.out.println("Sumata e: " + sumata);
	
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		backOrder(array);
		String test = "qwerty";
		String backString = reverseText(test);
		System.out.println(backString);
	}
	public static void sum(int a, int b) {
		int sum = a + b;
		System.out.println("Sum is " + sum);
	}
	public static int sumReturn(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public static void backOrder(int[] array) {
		int length = array.length;
		int[] reversed = new int[length];
		for (int index = 0; index < length; index++) {
			reversed[length - index - 1] = array[index];
		}
		// Print the reversed array
		System.out.println(Arrays.toString(reversed));
	}
	public static String reverseText(String text) {
		StringBuilder sb = new StringBuilder();
		for (int i = text.length() - 1; i >= 0; i--)
			sb.append(text.charAt(i));
		return sb.toString();
	}
}