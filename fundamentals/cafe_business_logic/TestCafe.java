import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {
      CafeUtil appTest = new CafeUtil();
    /* 
      You will need add 1 line to this file to create an instance 
      of the CafeUtil class. 
      Hint: it will need to correspond with the variable name used below..
    */
    	
        /* ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal(10));
    
        System.out.println("----- Order Total Test -----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test -----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
    
        System.out.println("\n----- Add Customer Test -----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }
        
        System.out.println("\n----- Add Multiple Customers Test -----");
          // ArrayList<String> customers = new ArrayList<String>();
          System.out.println("Hint: type barista");
          System.out.print("login:barista \nEnter password: ");
          appTest.addCustomers(customers);
        
        // System.out.println("\n----- Price Chart Test -----");
        // String product = "Drip Coffee";
        // double price = 2.00;
        // int maxQuantity = 6;
        // appTest.printPriceChart(product, price, maxQuantity);
        
        System.out.println("\n----- Item Quantity Test -----");
        String product = "Columbian Coffee Grounds";
        double price = 15.00;
        int maxQuantity = 3;
        appTest.printPriceChart(product, price, maxQuantity);
        
        System.out.println("\n----- Menu With Price Test -----");
        ArrayList<String> menuItems = new ArrayList<String>(
          Arrays.asList("drip coffee", "cappucino", "latte", "mocha"));
        ArrayList<Double> prices = new ArrayList<Double>(
          Arrays.asList(1.50, 3.50, 4.50, 3.50));
        appTest.displayMenu(menuItems, prices);
    }
}
