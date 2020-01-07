package by.training.arrays.ex7;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter Z: ");
                int Z = scanner.nextInt();
                System.out.println("Enter length of array: \nOr 0 to exit");
                int n = scanner.nextInt();
                if (n == 0) break;
                int[] array = new int[n];
                int counter = 0;
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter element: ");
                    array[i] = scanner.nextInt();
                    if(array[i] > Z){
                        array[i] = Z;
                        counter++;
                    }
                }
                System.out.println(Arrays.toString(array));
                System.out.println("Iterations: " + counter);
            }catch (InputMismatchException e){
                System.out.println("Enter valid data.");
            }
        }
    }
}