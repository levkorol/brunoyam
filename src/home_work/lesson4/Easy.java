package home_work.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Easy {
    public static void main(String[] args) {

        int max = 0;
        Random random = new Random();
        int [] numbers = new int [10];

        for (int i = 0; i <  numbers.length; i++) {
           numbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));
        for(int number : numbers) {
            if(number > max) {
                max = number;
            }
        }

        System.out.println("Максимальное число = " + max);
    }
}
