class GFG { 
// Function to print all sub strings 
    static void subString(char str[], int n) { 
        for (int len = 1; len <= n; len++)

            for (int i = 0; i <= n - len; i++) {  

                for (int k = i; k <= i + len - 1; k++)
                    System.out.print(str[k]); 
                System.out.println(); 
            } 
    } 
  
// Driver program to test above function 
    public static void main(String[] args) { 
        char str[] = {'a', 'b', 'c'}; 
        subString(str, str.length); 
      
    } 
}
