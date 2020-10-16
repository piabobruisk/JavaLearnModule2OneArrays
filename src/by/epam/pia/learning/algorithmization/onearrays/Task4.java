package by.epam.pia.learning.algorithmization.onearrays;
//4. Даны действительные числа а1 ,а2 ,..., аn .
//Поменять местами наибольший и наименьший элементы.

import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int n;
        int[] a;

        int maxIndex;
        int minIndex;

        do {
            n = input("Введите размерность массива N(>0)=");
        } while (n < 1);

        a = createArray(n);
        maxIndex = 0;
        minIndex = 0;

        // если нужно все ОДИНАКОВЫЕ поменять то нужно переделать
        for (int i = 1; i < a.length; i++) {
            if (a[maxIndex] < a[i]) {
                maxIndex = i;
            }
            if (a[minIndex] > a[i]) {
                minIndex = i;
            }
        }
        int tmp = a[maxIndex];
        a[maxIndex] = a[minIndex];
        a[minIndex] = tmp;
        System.out.print("Вывод результата работы:");
        // если переделывать то тут совместно с выводом производить замену
        // и олдскульный цикл тогда
        for (int j : a) {
            System.out.print(j + ", ");
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
