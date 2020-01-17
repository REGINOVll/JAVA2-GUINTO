import java.util.Scanner;

public class MajorOutput01 {
	public static void  main (String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("ENTER THE DIVIDENT : ");
		int dividend = scan.nextInt();
		System.out.println("ENTER THE DIVISOR : ");
		int divisor = scan.nextInt();

		int remainder = dividend%divisor;
		System.out.print("The remainder is " + remainder);

	}
}