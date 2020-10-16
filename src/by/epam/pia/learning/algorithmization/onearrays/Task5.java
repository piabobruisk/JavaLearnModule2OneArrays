package by.epam.pia.learning.algorithmization.onearrays;

//5. Даны целые числа а1 ,а2 ,..., аn .
//Вывести на печать только те числа, для которых аi > i.

import java.util.Random;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        int n;
        int[] a;


        do {
            n = input("Введите размерность массива N(>0)=");
        } while (n < 1);

        a = createArray(n);

        System.out.print("Вывод результата работы:  ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > i) {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println("\b\b");
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
