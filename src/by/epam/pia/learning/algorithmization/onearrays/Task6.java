package by.epam.pia.learning.algorithmization.onearrays;

//6. Задана последовательность N вещественных чисел.
//Вычислить сумму чисел, порядковые номера которых являются простыми числами.

import java.util.Random;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        int n;
        int[] a;
        int sum;

        do {
            n = input("Введите размерность массива N(>0)=");
        } while (n < 1);

        a = createArray(n);
        sum = 0;

        System.out.print("Сумма чисел:  ");
        //Цикл идет по порядковым номерам а не индексам массива. 1 не является простым числом. По этому цикл начат с 2-х.
        for (int i = 2; i <= n; i++) {
            boolean isPrimeNumber = true;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                sum += a[i - 1];// переход от порядкового номера к индексу массива
                System.out.print(a[i - 1] + ", ");
            }
        }
        System.out.println("\b\b");
        System.out.println("Равна:" + sum);
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
