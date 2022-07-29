package home_work.lesson2;

import java.util.Scanner;

/**
 * Передать на вход программы число от 1 до 7 в качестве аргумента.
 * Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.
 * Используем конструкцию if-else-if.
 **/

public class Easy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1..7");
        int input = scanner.nextInt();

        String weekDay = "";
        if (input >= 1 && input <= 7) {
            if (input == 1) {
                weekDay = "Понедельник";
                System.out.println(weekDay);
            }
            if (input == 2) {
                weekDay = "Вторник";
                System.out.println(weekDay);
            }
            if (input == 3) {
                weekDay = "Среда";
                System.out.println(weekDay);
            }
            if (input == 4) {
                weekDay = "Четверг";
                System.out.println(weekDay);
            }
            if (input == 5) {
                weekDay = "Пятница";
                System.out.println(weekDay);
            }
            if (input == 6 || input == 7) {
                weekDay = "Выходной";
                System.out.println(weekDay);
            }
        } else {
            System.out.println("Число не в диапазоне 1..7");
        }
    }
}
