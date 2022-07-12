package fundamentals.cafe_java;

public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 1.5;
        double lattePrice = 2.5;
        double cappucinoPrice = 2.5;
        double total;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // ** Your customer interaction print statements will go here ** //

        if (isReadyOrder1){
            System.out.println(generalGreeting + customer1 + readyMessage);
        }else{
            System.out.println(generalGreeting + customer1 + pendingMessage);
        }

        if (isReadyOrder4){
            System.out.println(generalGreeting + customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappucinoPrice);
            
        }else{
            System.out.println(generalGreeting + customer4 + pendingMessage);
        }

        if (isReadyOrder2){
            System.out.println(generalGreeting + customer2 + readyMessage);
            total = lattePrice * 2;
            System.out.println(displayTotalMessage + total);
            
        }else{
            System.out.println(generalGreeting + customer4 + pendingMessage);
        }

            System.out.println(generalGreeting + customer3);
            total = lattePrice - dripCoffeePrice;
            System.out.println(displayTotalMessage + total);
    }
}