import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int pos = 0;
        int neg = 0;
        int zer = 0;
        for(int i:arr){
            if(i>0){
                
                pos++;
            }else if(i<0){
                neg++;
            }else{
                zer++;
            }
        }
        

        double pos_ratio = (double)pos/arr.length;
        double neg_ratio = (double)neg/arr.length;
        double zer_ratio = (double)zer/arr.length;

        System.out.println(pos_ratio);
        System.out.println(neg_ratio);
        System.out.println(zer_ratio);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
