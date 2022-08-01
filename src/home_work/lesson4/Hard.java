package home_work.lesson4;

import java.util.Arrays;
import java.util.Random;

/**
 * Создайте массив из 10 случайных целых чисел из отрезка [0;100).
 * Отсортируйте данный массив и выведите результат в консоль.
 * <p>
 * Например, имеется следующий массив: 45, 37, 79, 45.
 * Отсортированный массив: 37, 45, 45, 79.
 */

public class Hard {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
            System.out.print(numbers[i] + " ");
        }

        Arrays.sort(numbers, 0, numbers.length);

        System.out.println();
        System.out.println("Отсортированный массив : ");

        System.out.print(Arrays.toString(numbers));
    }
}
