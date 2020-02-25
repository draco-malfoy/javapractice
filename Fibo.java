import java.util.*;

public class Fibo{
	public static void main(String []args){
		int n = 10;
		System.out.print("1 ");
		int sum = 0;
		int next;
		for(int i = 1; i <  n; i++){
			next = i + sum;
			sum = sum + next;
			System.out.print(next + " ");

		}
	}
}