import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int checkValue = arr[n-1];
        int m = n;
        for(int i = 0; i < m; i++){
            if(n==1){
                arr[n-1] = checkValue;

                for(int k:arr){
                    System.out.print(k+" ");
                }
                System.out.println();
                break;
            }else if(arr[n-2] > checkValue && n >= 2){
                arr[n-1] = arr[n-2];
                n--;

            }else{
                arr[n-1] = checkValue;
                for(int k:arr){
                    System.out.print(k+" ");
                }
                System.out.println();
                break;
            }

            for(int k:arr){
                System.out.print(k+" ");
            }
            System.out.println();
        }

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

        insertionSort1(n, arr);

        scanner.close();
    }
}
