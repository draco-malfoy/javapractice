import java.util.*;

class Activity{
	public static void main(String []args){
		int []arr = {4,5,2,6,1};
		int []brr = {2,8,1,3,5};
		int size = brr.length;

		int arr1[] = new int[5];

		for(int i = 0; i < size; i++){
			int gasAvailable = arr[i];
			int gasConsumed = brr[i];
			int count = 0;

			while(gasAvailable > gasConsumed){
				gasAvailable = gasAvailable + arr[i+1] - brr[i];
				gasConsumed = gasConsumed + brr[i+1];
				i++;
				count++;
				if (count == 5){
					arr1[i] = brr[i];
				}
			}
			

		}
		Arrays.sort(arr1);
		for(int i =0;i<=4;i++){
		System.out.print(arr1[i]);
}
	}
}