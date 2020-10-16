package by.epam.pia.learning.algorithmization.onearrays;

import java.util.Random;
import java.util.Scanner;

// Дана последовательность целых чисел а1 ,а2 ,..., аn.
// Образовать новую последовательность, выбросив из исходной те члены,
// которые равны min(а1 ,а2 ,..., аn).
public class Task8 {

    public static void main(String[] args) {

        int n;
        int[] a;

        do {
            n = input("Введите размерность массива N(>0)=");
        } while (n < 1);

        a = createArray(n);

        int min;
        int quantity;
        min=a[0];
        quantity=1;

        for (int i = 1; i <a.length; i++) {
            if (a[i]<min) {
                min=a[i];
                quantity=1;
            }else if (a[i]==min){
                quantity++;
            }
        }

        int [] result;
        int index;
        result = new int[n-quantity];
        index = 0;

        System.out.print("Вывод результата работы:  ");
        for (int tmp :a){
            if (tmp == min) continue;
            result[index]=tmp;
            System.out.print(result[index++] + ", ");
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
            a[i] = random.nextInt(10)-5;
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
