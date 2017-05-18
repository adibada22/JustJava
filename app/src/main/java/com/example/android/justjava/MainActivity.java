package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Global variable for coffee
     */
    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayMessage(createOrderSummary());
    }

    public int calculatePrice() {
        int price = quantity * 5;
        return price;
    }

    public String createOrderSummary() {
        String priceMessage = "Name: Jonathan Nunez";
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nTotal $" + calculatePrice();
        priceMessage += "\nThank you!";
        return priceMessage;

    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView quantityTextView = (TextView) findViewById(R.id.order_summary_text_view);
        quantityTextView.setText(message);
    }

    /**
     * This method displays the given quantity value on the screen
     */
    private void displayQuantity(int coffeeNumber) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + coffeeNumber);
     }


    /**
     * This method is called when "+" button is clicked.
     */
    public void increment(View view) {
        quantity++;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the "-" button is clicked
     */
    public void decrement(View view) {
        quantity--;
        displayQuantity(quantity);
    }
}
