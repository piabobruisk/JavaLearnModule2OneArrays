package by.epam.pia.learning.algorithmization.onearrays;

//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
// Заменить все ее члены, большие данного Z, этим числом.
// Подсчитать количество замен.

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int n;
        int[] a;
        int z;
        int quantity;

        do {
            n = input("Введите размерность массива n(>0)=");
        } while (n < 1);

        z = input("Введите z=");

        a = createArray(n);
        quantity = 0;

        System.out.print("Измененный массив :");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > z) {
                a[i] = z;
                quantity++;
            }
            System.out.print(a[i] + ", ");
        }
        System.out.println("\b\b");
        System.out.println("Произведено " + quantity + " замен.");
    }

    private static int[] createArray(int n){
        Random random;
        random = new Random();
        int [] a;
        a = new int[n];
        System.out.print("Инициализация массива:");
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
            System.out.print(a[i] + ", ");
        }
        System.out.println("\b\b");
        return a;
    }

    private static int input(String prompt) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }
        return scanner.nextInt();
    }
}