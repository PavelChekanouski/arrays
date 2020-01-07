package by.training.arrays.ex17;

import java.util.Arrays;
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
                for (int i = 0; i < n; i++) {
                    array[i] = scanner.nextInt();
                }

                int counter = 0;
                int min = array[0];

                for (int i = 0; i < n; i++) {
                    if (array[i] < min) {
                        min = array[i];
                        counter++;
                    }
                }

                int[] newArray = new int[n - counter - 1];

                for (int j = 0; j < n - counter; j++) {
                    for (int i = 0; i < n; i++) {
                        if (array[i] != min){
                            newArray[j] = array[i];
                            j++;
                        }
                    }
                }

                System.out.println(Arrays.toString(newArray));

            } catch (InputMismatchException e) {
                System.out.println("Enter valid data.");
            }
        }
    }
}