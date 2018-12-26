import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        OrderManager om = new OrderManager();

        Dish dish1 = new Dish(Dish.POTATO, Dish.POTATO_DESCRIPTION, 10);
        Dish dish2 = new Dish(Dish.BREAD, Dish.BREAD_DESCRIPTION, 5);

        Drink beer1 = new Drink(Drink.BEER, Drink.BEER_DESCRIPTION, 7);
        Drink wine1 = new Drink(Drink.WINE, Drink.WINE_DESCRIPTION, 8);

        Order order1 = new InternetOrder();

        order1.addItem(dish2);
        order1.addItem(wine1);
        order1.addItem(beer1);

        System.out.println("5 + 7 + 8 = " + order1.getCost());
        System.out.println("Пива = " + order1.getAmount(Drink.BEER));
        System.out.println("Наименования = " + Arrays.toString(order1.getNames()));
        System.out.println("Состав по цене = " + Arrays.toString(order1.getItemsSortedByCost()));

        System.out.println("Состав = " + Arrays.toString(order1.getItems()));
        order1.removeItem(Drink.BEER);
        System.out.println("Состав = " + Arrays.toString(order1.getItems()));

        order1.addItem(beer1);
        order1.removeAllItems(Drink.BEER);
        System.out.println("Состав = " + Arrays.toString(order1.getItems()));

        Order order2 = new InternetOrder(new Item[]{wine1, dish2});
        Order order3 = new InternetOrder(new Item[]{wine1, dish2});

        try {
            om.addOrder("Moon", order1);
            om.addOrder("ISS", order2);
        } catch (Exception e) {
            System.out.println("Wrongly catched");
        }

        try {
            om.addOrder("ISS", order3);
            System.out.println("Wrongly not Catched");
        } catch (Exception e) {
            System.out.println("Catched");
        }

        System.out.println("Стоимость заказов = " + om.getCost());

        System.out.println("Хлеб = " + om.getAmount(Dish.BREAD));

        System.out.println("Заказы InternetOrder = " + om.getIternetOrders().length);

        om.addItemToOrder("ISS", beer1);

        System.out.println("Стоимость заказов = " + om.getCost());
    }
}
