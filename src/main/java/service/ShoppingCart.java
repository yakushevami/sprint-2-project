package service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalWithoutDiscount() {
        double countPrice = 0;
        for (Food food : foods) {
            countPrice += food.getPrice() * food.getAmount();
        }
        return countPrice;
    }

    public double getTotalWithDiscount() {
        double countPrice = 0;
        for (Food food : foods) {
            countPrice += (food.getPrice() - discountSum(food)) * food.getAmount();
        }
        return countPrice;
    }

    public double getTotalVegetariansWithoutDiscount() {
        double countPrice = 0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                countPrice += food.getPrice() * food.getAmount();
            }
        }
        return countPrice;
    }

    private double discountSum(Food food) {
        return food.getPrice() / 100 * food.getDiscount();
    }

}