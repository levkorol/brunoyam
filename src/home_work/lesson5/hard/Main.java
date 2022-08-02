package home_work.lesson5.hard;

/**
 * Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 * Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 * Создать класс Basket, содержащий массив купленных товаров.
 * Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.
 */
public class Main {
    public static void main(String[] args) {

        Category category1 = new Category();
        Product productCategory1 = new Product();
        Product product2Category1 = new Product();

        setTestsProductsCategory1(productCategory1, product2Category1);

        Product[] productsCategory1 = {productCategory1, product2Category1};
        category1.setProducts(productsCategory1);
        category1.setName("Напитки");

        Category category2 = new Category();
        Product productCategory2 = new Product();
        Product product2Category2 = new Product();

        setTestsProductsCategory2(productCategory2, product2Category2);

        Product[] productsCategory2 = {productCategory2, product2Category2};
        category2.setProducts(productsCategory2);
        category2.setName("Еда");

        System.out.println(category1);
        System.out.println(category2);

        User user = new User();
        user.setLogin("user");
        user.setPassword("1234");
        Basket basket = new Basket();
        Product [] productsBought = {product2Category2, productCategory1};
        basket.setProductsBought(productsBought);
        user.setBasket(basket);

        System.out.println(user);
    }

    private static void setTestsProductsCategory1(Product productCategory1, Product productCategory2) {
        productCategory1.setName("Вода");
        productCategory1.setRating(4.6);
        productCategory1.setPrice(234.40);

        productCategory2.setName("Сок");
        productCategory2.setRating(5.6);
        productCategory2.setPrice(73.5);
    }

    private static void setTestsProductsCategory2(Product productCategory2, Product product2Category2) {
        productCategory2.setName("Хлеб");
        productCategory2.setRating(4.6);
        productCategory2.setPrice(4.40);

        product2Category2.setName("Круассан");
        product2Category2.setRating(1.6);
        product2Category2.setPrice(3.5);
    }


}
