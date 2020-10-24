import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
    
    String [] list_sq = new String[n];
    String [] list_space = new String[n];
    String square = "#";
    String spaces = "";
    for(int i = 0; i < n; i++){
        list_sq[i] = square;
        list_space[n-1-i] = spaces;

        square = square + "#";
        spaces = spaces + " ";
    }
    for(int i = 0; i < n; i++)
        System.out.println(list_space[i] + list_sq[i]);

    

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
