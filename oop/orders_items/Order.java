import java.util.ArrayList;

public class Order {    
    public String name;
    public double total;
    public boolean ready;
    private double itemTotal;
    public ArrayList<Item> items = new ArrayList<Item>();

    public void createOrder(String name, boolean ready, ArrayList<Item> items) {
        this.name = name;
        this.ready = ready;
        this.items = items;
        for (int i = 0; i < items.size(); i++){
            double price = items.get(i).getPrice();
            itemTotal += price;
        }
        this.total = itemTotal;
    }
}