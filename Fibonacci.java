import java.util.*;

 class Fibonacci {
 	public static void main(String args[]) {
 		System.out.println("Enter a number:");
 		Scanner scan = new Scanner(System.in);
 		int num = scan.nextInt();
 		System.out.println("The Fibonacci series is");
 		if (num == 0 || num == 1)
 			System.out.println(num);
 		else
 			System.out.println("break");

 	}
 }