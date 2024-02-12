package model;

import static model.constants.Color.COLOR_RED;
import static model.constants.Discount.DISCOUNT_FOR_ALL;
import static model.constants.Discount.DISCOUNT_FOR_RED_APPLE;

public class Apple extends Food {
    private final String color;
    public Apple (int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    @Override
    public double getDiscount() {
        if (color.equals(COLOR_RED)) {
        return DISCOUNT_FOR_RED_APPLE;
    } else {
            return DISCOUNT_FOR_ALL;
        }
    }
}