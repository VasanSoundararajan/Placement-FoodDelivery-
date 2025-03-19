import java.lang.System.Logger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodDelivery foodDelivery = new FoodDelivery();
        var userInput = 1;

        do {
            System.out.println("Enter 1 to place order, 2 to cancel order, 3 to rate restaurant, 0 to exit");
            userInput = sc.nextInt();
            switch (userInput) {
                case 0:
                    return;
                case 1:
                    foodDelivery.placeOrder();
                    break;
                case 2:
                    foodDelivery.cancelOrder();
                    break;
                case 3:
                    foodDelivery.rateRestaurant();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } while (userInput != 0);
    }
}

class FoodDelivery {
    String[] odr = new String[5];
    int oC = 0; 
    String[] ar = {"Item_1", "Item_2", "Item_3", "Item_4", "Item_5"};
    int[] price = {10, 20, 30, 40, 50};
    void menu() {
        System.out.println("Menu items: ");
        System.out.println("1. Item 1, Price: Rs. 10");
        System.out.println("2. Item 2, Price: Rs. 20");
        System.out.println("3. Item 3, Price: Rs. 30");
        System.out.println("4. Item 4, Price: Rs. 40");
        System.out.println("5. Item 5, Price: Rs. 50");
        System.out.println("Enter the Id to add to bucket list:");

        ArrayList<String> bucketList = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            int sum = 0;
            int id = sc.nextInt();
            if(id == 0){
                System.out.println("All Item added");
                 break;
            }
            int qty = sc.nextInt();
            if (id >= 1 && id <= 5) {
                String bl = "" + id + " " + ar[id-1] + " "+ qty;
                bucketList.add(bl);
                System.out.println("Item added to bucket list.");
            } else { 
                System.out.println("Invalid Id. Enter the Id again:");
            }
        }
        bill(bucketList);
    }
    void bill(ArrayList<String> bucketList) {
        int sum = 0;
        for (String item : bucketList) {
            String[] parts = item.split(" ");
            int sum1 = price[Integer.parseInt(parts[0])] * Integer.parseInt(parts[2]);
            System.out.println(parts[0]+ "\t"+ parts[1]+ "X"+ parts[2]+ "\t"+ sum1);
            sum += sum1;
        }
        System.out.println("Total bill: Rs. " + sum);
    }
    void placeOrder() {
        if (oC < odr.length) {
            menu();
            odr[oC++] = "Ordered";
            System.out.println("Order placed successfully. Total orders: " + oC);
        } else {
            System.out.println("Order limit reached! Can't place more orders.");
        }
    }

    void cancelOrder() {
        if (oC > 0 && odr[oC - 1].equals("Ordered")) {
            odr[oC - 1] = "Cancelled";
            oC--;
            System.out.println("Order cancelled successfully.");
        } else {
            System.out.println("No pending orders to cancel.");
        }
    }

    void rateRestaurant() {
        if (oC > 0) {
            System.out.println("Thank you for rating the restaurant!");
        } else {
            System.out.println("Place an order before rating.");
        }
    }
}
