package by.epam.pia.learning.algorithmization.onearrays;

import java.util.Random;
import java.util.Scanner;

//7. Даны действительные числа а1 ,а2 ,..., а2n. Найти
//max(a1+a2n,a2+a2n-1,An+an+1)

public class Task7 {

    private static final int RANGE = 10;

    public static void main(String[] args) {

        int n;
        int[] a;

        do {
            n = input("Введите размерность массива N(>0)=");
        } while (n < 1);

        a = createArray(n*2);

        int sum;
        sum=a[0]+a[a.length-1];

        System.out.println("Сумма элементов 0-"+(a.length-1)+"="+sum);

        for (int i=1, j=a.length-2; i<n; i++,j--){
            int tmp=a[i]+a[j];
            if (sum<tmp) sum=tmp;
            System.out.println("Сумма элементов"+i+"-"+j+"="+tmp);
        }

        System.out.print("Максимальная сумма="+sum);

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
