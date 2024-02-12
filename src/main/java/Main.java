import model.Food;
import model.Meat;
import model.Apple;
import service.ShoppingCart;

import static model.constants.Color.COLOR_GREEN;
import static model.constants.Color.COLOR_RED;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100.0);
        Food redApple = new Apple(10, 50.0, COLOR_RED);
        Food greenApple = new Apple(8, 60.0, COLOR_GREEN);

        Food[] foods = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println("Сумма товаров без скидки " + shoppingCart.getTotalWithoutDiscount());
        System.out.println("Сумма товаров со скидкой " + shoppingCart.getTotalWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки "+ shoppingCart.getTotalVegetariansWithoutDiscount());
    }
}