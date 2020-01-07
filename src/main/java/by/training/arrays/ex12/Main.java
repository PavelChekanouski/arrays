package by.training.arrays.ex12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter length of array: \nOr 0 to exit");
                int n = scanner.nextInt();
                if (n == 0) break;
                int[] array = new int[n];
                for (int i = 0; i < n; i++){
                    array[i] = scanner.nextInt();
                }
                int sum = 0;
                for (int i = 0; i < n; i++ ){
                    if(isPrimeNumber(i)){
                        sum += array[i];
                    }
                }
                System.out.println(sum);
            }catch (InputMismatchException e){
                System.out.println("Enter valid data.");
            }
        }
    }
    public static boolean isPrimeNumber(int i){
         int k = 0;

            for (int j = 2; j <= i; j++) {
                if (( i % j) == 0)
                    k++;
            }

            if (k<2){
               return true;
            }
        return false;
    }
}
