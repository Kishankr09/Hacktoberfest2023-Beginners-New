
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
       int nonZeroIndex = 0; // Initialize a pointer to keep track of non-zero elements
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // If the current element is non-zero, move it to the nonZeroIndex position
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        
        // Fill the remaining positions with zeros
        for (int i = nonZeroIndex; i < n; i++) {
            arr[i] = 0;
        }
    }
}
