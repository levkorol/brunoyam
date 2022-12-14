package home_work.lesson2;

import java.util.Scanner;

/**
 * Представим, что у нас есть загадка: "Что это такое: синий, большой, с усами и полностью набит зайцами?".
 * Ответ: троллейбус. Можно возражать, конечно, какого цвета сейчас троллейбусы - но мы не об этом.
 * <p>
 * Представим, что Вы загадываете эту загадку пользователю. Создайте программу, которая будет считывать с консоли ответ:
 * - если пользователь вводит "Троллейбус", мы выводим в консоль "Правильно!" и программа должна завершиться;
 * - если пользователь вводит любой другой ответ, мы выводим в консоль "Неправильно!".
 * <p>
 * Сначала решить используя условный оператор switch, затем - if.
 **/

public class Hard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        String input2 = scanner.nextLine();
        switch (input2) {
            case "Троллейбус":
                System.out.println("Правильно!");
                break;
            default:
                System.out.println("Неправильно!");
        }


        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        String input = scanner.nextLine();

        if (input.equals("Троллейбус")) {
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно!");
        }

    }
}
