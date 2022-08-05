package home_work.lesson6.easy;


/*
Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны и еще что-то на свой вкус).

Класс Flower должен содержать переменную-счетчик (количество цветов).

Собрать 3 букета (то есть 3 массива типа Flower). В букет может входить несколько цветов разного типа.
Вывести на консоль количество созданных объектов типа Flower используя переменную-счетчик из класса Flower.
 */
public class Main {
    public static void main(String[] args) {

        Chamomile chamomile = new Chamomile();
        Flower.quantity ++;
        Carnation carnation = new Carnation();
        Flower.quantity ++;
        Tulip tulip = new Tulip();
        Flower.quantity ++;
        Rose rose = new Rose();
        Flower.quantity ++;

        Flower [] flowers = { chamomile, chamomile, tulip };
        Flower [] flowers2 = { carnation, chamomile, rose };
        Flower [] flowers3 = { rose, chamomile, tulip };
        int all = Flower.quantity +  flowers.length + flowers2.length + flowers3.length;

        System.out.println("Количество созданных обьектов типа Flower " + Flower.quantity + " с обьектами в массивах " + all);

    }
}
