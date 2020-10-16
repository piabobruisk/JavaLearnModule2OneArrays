package by.epam.pia.learning.algorithmization.onearrays;

//10. Дан целочисленный массив с количеством элементов п.
//Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).

import java.util.Random;
import java.util.Scanner;

public class Task10 {

    private static final int RANGE = 10;

    public static void main(String[] args) {

        int n;
        int[] a;

        do {
            n = input("Введите размерность массива N(>0)=");
        } while (n < 1);

        a = createArray(n);

        System.out.print("Вывод результата работы:  ");
        for (int i=0; i<(a.length+1)/2; i++){
            a[i]=a[i*2];
            System.out.print(a[i] + ", ");
        }
        for (int i=(a.length+1)/2; i<a.length; i++){
            a[i]=0;
            System.out.print(a[i] + ", ");
        }
        System.out.println("\b\b");
    }

    private static int[] createArray(int n) {
        Random random;
        random = new Random();
        int[] a;
        a = new int[n];
        System.out.print("Инициализация массива:");
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(RANGE);
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
