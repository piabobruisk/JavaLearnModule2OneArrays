package by.epam.pia.learning.algorithmization.onearrays;

//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
//Если таких чисел несколько, то определить наименьшее из них.

import java.util.Random;
import java.util.Scanner;

public class Task9 {

    private static final int RANGE = 10;

    public static void main(String[] args) {

        int n;
        int[] a;
        int[] frequency;

        do {
            n = input("Введите размерность массива N(>0)=");
        } while (n < 1);

        a = createArray(n);
        frequency = new int[RANGE];

        for (int j : a) {
            frequency[j]++;
        }

        int max;
        int indexMax;
        max= frequency[0];
        indexMax=0;

        for (int i = 1; i < frequency.length; i++) {
            System.out.println("Число "+ i + " встречается в массиве "+ frequency[i] +"раз");
            if (frequency[i] > max){
                max=frequency[i];
                indexMax=i;
            }else if (frequency[i] == max){
                indexMax=Math.min(indexMax,i);
            }
        }
        System.out.print("Минимальное число наиболее часто встречающееся в массиве:"+indexMax);
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
