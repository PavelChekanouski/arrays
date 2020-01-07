package by.training.arrays.ex2;

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
                int counter = 0;
                for (int i = 0; i < n; i++){
                    System.out.println("Enter element: ");
                    array[i] = scanner.nextInt();
                    if(array[i]  == 0){
                        counter++;
                    }
                }

                int[] zeros = new int[counter];
                for(int i = 0; i < counter; i++){
                    for(int j = 0; j < n; j++){
                        if(array[j] == 0){
                            zeros[i] = j;
                            i++;
                        }
                    }
                }
                System.out.println(Arrays.toString(zeros));
            }catch (InputMismatchException e){
                System.out.println("Enter valid data.");
            }
        }
    }
}
