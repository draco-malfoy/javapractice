import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HRFraudulentNotfif {
    static int activityNotifications(int[] expenditure, int d) {
        int count=0;
        int []subArray = new int[d];
        for(int i = d+1; i <= expenditure.length; i++){
            for(int j = 0; j < d; j++)
                subArray[j] = expenditure[i+j-d-1];
            Arrays.sort(subArray);
            int medi;
            if(d%2 != 0)
                medi = subArray[(d/2)];
            else
                medi = (double)[subArray[d/2-1] + subArray[(d/2)]]/2;

            double twice = 2 * medi;
            if(expenditure[i-1] >= twice)
                count++;

        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" "); 

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
