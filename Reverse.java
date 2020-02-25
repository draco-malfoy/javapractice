import java.util.*;

class Reverse{
	public static void main(String []args){
		String str = "eminem";
		int len = str.length();
		char []arr = new char[len];
		for(int i = 0; i < len; i++){
			arr[i] = str.charAt(len-i-1);
		}
		// Arrays.toString(arr);
		System.out.println(arr);
	}
}