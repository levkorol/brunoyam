package home_work.lesson1;

public class Hard {

    public static void main(String[] args) {
        int productPriceA = 1000;
        int productPriceB = 500;

        int priceSum = productPriceA + productPriceB;
        int discount = priceSum / 10;
        int discountedSum = (productPriceA + productPriceB) - discount;

        System.out.println("Сумма со скидкой" + " " + discountedSum);
        System.out.println("Сумма скидки" + " " + discount);
    }
}
