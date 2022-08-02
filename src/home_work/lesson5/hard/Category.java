package home_work.lesson5.hard;

import java.util.Arrays;

public class Category {

    private String name;
    private Product[] products;

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
