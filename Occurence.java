import java.io.*;
import java.util.*;

class Occurence{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] arr = str.split("\\s+");

		System.out.println(Arrays.toString(arr));
	}
}