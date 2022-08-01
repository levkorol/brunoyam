package home_work.lesson4;

import java.util.Scanner;

/**
 * Создайте массив из 10 случайных целых чисел из отрезка [20;100).
 * Выведите в консоль содержимое массива, чтобы пользовател ввел с клавиатуры число из этого массива.
 * Выведите в консоль индекс элемента, который ввел пользователь, в массиве.
 * Если пользователь ввел число, которого нету в массиве, то выведите ошибку.
 */

public class Normal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int min = 20;
        int max = 100;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd(min, max);
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        System.out.println("Введите число из массива :");

        int input = scanner.nextInt();

        int correctlyNumber = 0;
        boolean isError = true;

        for (int number : numbers) {
            if (input == number) {
                correctlyNumber = input;
                isError = false;
                break;
            }
        }

        if (isError) {
            System.out.println("Ошибка, нет такого числа!");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if(correctlyNumber == numbers[i]) {
                    System.out.println("Индекс для числа " + correctlyNumber + " = " + i);
                    break;
                }
            }
        }
    }

    private static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
