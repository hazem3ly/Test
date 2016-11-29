package com.example.hazem.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    int x=0;
    public void nigativeOrder(View view){
        if(x>0)
            x--;
        else x=0;
        displayquantity(x);

    }
    public void pluseOrder(View view){
        x++;
        displayquantity(x);
    }
    public void submitOrder(View view) {
       // displayPrice(x*5);
       // String priceMessage = "Thank You!";
       // displayMassage(priceMessage);

        String message= orderSumary(x);
        displayMassage(message);
    }
    private String orderSumary (int number){
        return "name: zoooom\n" + "Quantity: " + number +"\n" + "Total: $" + number * 5 +"\n" + "THANK YOU ZOOOOM!";

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayquantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.orde_summary_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMassage(String message){
        TextView orderSummaryTextView =(TextView) findViewById(R.id.orde_summary_text_view);
        orderSummaryTextView.setText("" + message);
    }

}
