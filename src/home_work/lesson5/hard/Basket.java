package home_work.lesson5.hard;

import java.util.Arrays;

public class Basket {

    private Product[] productsBought;

    public void setProductsBought(Product[] productsBought) {
        this.productsBought = productsBought;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "productsBought=" + Arrays.toString(productsBought) +
                '}';
    }
}
