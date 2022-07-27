import java.util.ArrayList;
import java.util.Arrays;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        item1.createItem("mocha", 3.5);
        item2.createItem("latte", 3.0);
        item3.createItem("drip coffee", 2.5);
        item4.createItem("capuccino", 3.0);

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        ArrayList<Item> order1Items = new ArrayList<Item>(
            Arrays.asList(item1, item2));
        ArrayList<Item> order2Items = new ArrayList<Item>(
            Arrays.asList(item2));
        ArrayList<Item> order3Items = new ArrayList<Item>(
            Arrays.asList(item4));
        ArrayList<Item> order4Items = new ArrayList<Item>(
            Arrays.asList(item4, item2, item2));

        order1.createOrder("Cindhuri",true, order1Items);
        order2.createOrder("Jimmy", false, order2Items);
        order3.createOrder("Noah", true, order3Items);
        order4.createOrder("Sam", false, order4Items);

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}