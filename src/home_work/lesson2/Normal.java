package home_work.lesson2;


import java.util.Scanner;

/**
 Переписать задание "Дни недели" используя оператор switch.
 **/

public class Normal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1..7");
        int input = scanner.nextInt();

        String weekDay = "";
        if (input >= 1 && input <= 7) {
            switch (input) {
                case 1:
                    weekDay = "Понедельник";
                    System.out.println(weekDay);
                    break;
                case 2:
                    weekDay = "Вторник";
                    System.out.println(weekDay);
                    break;
                case 3:
                    weekDay = "Среда";
                    System.out.println(weekDay);
                    break;
                case 4:
                    weekDay = "Четверг";
                    System.out.println(weekDay);
                    break;
                case 5:
                    weekDay = "Пятница";
                    System.out.println(weekDay);
                    break;
                default:
                    weekDay = "Выходной";
                    System.out.println(weekDay);
            }
        } else {
            System.out.println("Число не в диапазоне 1..7");
        }
    }
}
