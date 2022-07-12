import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(int week) {
        int sum = 0;
        for (int i= 1; i <= week; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double item : prices) {
            total += item;
        }
        return total;
    }

    void displayMenu(ArrayList<String> menuItems) {
        for (int i=0; i<menuItems.size();i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    void addCustomer(ArrayList<String> customers) {
        System.out.print("Please Enter your name: ");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!%n" ,userName);
        if (customers.size() == 1){
            System.out.printf("There is %s person in front of you.%n" ,customers.size());
        }
        else {
            System.out.printf("There are %s people in front of you.%n" ,customers.size());
        }
        customers.add(userName);
        System.out.println(customers);
    }

    void addCustomers(ArrayList<String> customers) {;
        String userName = (System.console().readLine()).trim();
        if (userName.equals("barista")) {
            System.out.printf("Enter new users one name at a time. %nType q to finish. %n");
            ArrayList<String> newCustomers = new ArrayList<String>();
            while (!userName.equals("q")) {
                userName = (System.console().readLine()).trim();
                if (!userName.equals("q")) {
                    if (!userName.equals("")) {
                        newCustomers.add(userName);
                        customers.add(userName);
                    }
                }
                System.out.printf("Customers added: %s%n", newCustomers);
            System.out.println("");
            }
        }
    }

    void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            double discount = (i-1) * 0.5;
            double total = i * (price) - discount;
            System.out.printf("%d - $%.2f%n", i, total);
        }
    }

    boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            System.out.println("Lists not the same length!");
            return false;
        }
        for (int i=0; i < menuItems.size(); i++){
            String item = menuItems.get(i);
            double price = prices.get(i);
            System.out.printf("%d %s -- $%.2f %n", i, item, price);
        }
        return true;
    }
}