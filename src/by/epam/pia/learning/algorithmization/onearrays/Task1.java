package by.epam.pia.learning.algorithmization.onearrays;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int n;
        int[] a;
        int k;
        int sum;

        do {
            n = Math.abs(input("Введите размерность массива n(>0)="));
        } while (n < 1);

        do {
            k = input("Введите k(>0) = ");
        } while (k < 1);

        a=createArray(n);
        sum = 0;

        System.out.print("Элементы кратные " + k + ":");
        for (int j : a) {
            if (j % k == 0) {
                System.out.print(j + ", ");
                sum += j;
            }
        }
        System.out.println("\b\b");
        System.out.println("Сумма элементов массива кратных " + k + " = " + sum);
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
