# Food Delivery Console Application

This Java console application simulates a simple food delivery system with features like placing orders, canceling orders, and rating restaurants.

## Features
- **Menu Display:** Shows a list of available items with their prices.
- **Order Placement:** Allows users to add items to their order and calculates the total bill.
- **Order Cancellation:** Users can cancel their most recent order if it's pending.
- **Restaurant Rating:** Users can rate the restaurant after placing an order.

---

## How to Use
### Step 1: Compile the Code
Run the following command in your terminal:
```sh
javac Main.java
```

### Step 2: Run the Application
Execute the compiled code using:
```sh
java Main
```

### Step 3: Follow the Console Instructions
- Enter **1** to place an order.
- Enter **2** to cancel the last order.
- Enter **3** to rate the restaurant.
- Enter **0** to exit the application.

---

## Code Explanation
### `Main` Class
- **`main()` Method:**
  - Provides a menu-driven interface for user input.
  - Uses a `Scanner` to take user input and directs the flow to relevant methods in the `FoodDelivery` class.

### `FoodDelivery` Class
- **`menu()` Method:**
  - Displays the available food items with their prices.
  - Accepts item IDs and quantities to add to the bucket list.
  - Calls the `bill()` method to calculate the total bill.

- **`bill()` Method:**
  - Iterates through the bucket list and calculates the total cost.
  - Displays each item along with its quantity and price.

- **`placeOrder()` Method:**
  - Invokes the `menu()` method to start order placement.
  - Ensures the order count (`oC`) doesn't exceed the limit.

- **`cancelOrder()` Method:**
  - Cancels the most recent pending order if available.

- **`rateRestaurant()` Method:**
  - Allows users to rate the restaurant if they've previously placed an order.

---

## Sample Output
```
Enter 1 to place order, 2 to cancel order, 3 to rate restaurant, 0 to exit
1
Menu items:
1. Item 1, Price: Rs. 10
2. Item 2, Price: Rs. 20
3. Item 3, Price: Rs. 30
4. Item 4, Price: Rs. 40
5. Item 5, Price: Rs. 50
Enter the Id to add to bucket list:
1 2
Item added to bucket list.
0
All Item added
1 Item_1 X2 	 Rs. 20
Total bill: Rs. 20
Order placed successfully. Total orders: 1
```

---

## Future Improvements
- Add dynamic menu updates with new items and prices.
- Improve the user interface for better navigation.
- Implement order tracking and delivery status.

---

## License
This project is open-source and free to use under the MIT License.

