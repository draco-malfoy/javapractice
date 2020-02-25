import java.util.*;
import java.lang.*;
import java.io.*;
public class ArrayRotate
 {
	public static void main (String[] args)
	 {
	    List<Integer> alist = new ArrayList<Integer>();
	    alist.add(1);
	    alist.add(2);
	    alist.add(3);
	    alist.add(4);
	    alist.add(5);

	    int n = alist.size();
	    for(int i =0; i< n-2; i++){
	        int temp;
	        for(int j = 0; j < n-1; j++){
	            temp = alist.get(j+1);
	            alist.add(j+1,alist.get(j));
	        }
	        alist.add(0,alist.get(n)) ;
	        alist.remove(n-i+1);
	    }

	    System.out.print(alist);
	    
	 }
}