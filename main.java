package Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static long[] fibArr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        fibArr = new long[num+1];
        System.out.println(FibonacciNumbers(num));

    }
    public static long FibonacciNumbers(int n) {
        if (n < 2)
            return 1;
        if(fibArr[n] != 0){
            return fibArr[n];
        }
        return fibArr[n] = FibonacciNumbers(n - 1) + FibonacciNumbers(n - 2);
    }

}
