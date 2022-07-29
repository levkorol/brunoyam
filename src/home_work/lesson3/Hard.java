package home_work.lesson3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Вывести последовательность Фибоначчи до n.
 * Загуглить, что из себя представляет ряд Фибоначчи.
 * <p>
 * Числа Фибоначчи — бескочечная числовая последовательность ,
 * в которой каждое число есть сумма двух предыдущих: . F n = F n − 1 + F n − 2
 **/
public class Hard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");

        int input = scanner.nextInt();

        int[] array = new int[input];

        for (int i = 1; i < array.length; i++) {
                if (i < 2) {
                    array[i] = 1;
                } else {
                    array[i] = array[i - 1] + array[i - 2];
                }
        }

        if(input == 0) {
            System.out.println(input);
        } else {
            System.out.print("Числа Фибоначчи для числа " + input + " = " + Arrays.toString(array) + " ");
        }
    }
}
