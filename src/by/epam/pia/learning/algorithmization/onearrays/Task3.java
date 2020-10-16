package by.epam.pia.learning.algorithmization.onearrays;

//3. Дан массив действительных чисел, размерность которого N.
//Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int n;
        int[] a;

        int negative;
        int zero;
        int positive;

        do {
            n = input("Введите размерность массива N(>0)=");
        } while (n < 1);

        a = createArray(n);
        negative = 0;
        zero = 0;
        positive = 0;

        for (double j : a) {
            if (j > 0) {
                positive++;
            } else if (j < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Массив содержит числа: \n\tотрицательных:" + negative + ", \n\tравных нулю:" + zero + ", \n\tположительных:" + positive + ".");
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
