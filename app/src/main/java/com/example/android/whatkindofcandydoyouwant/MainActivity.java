package com.example.android.whatkindofcandydoyouwant;

        import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import static com.example.android.whatkindofcandydoyouwant.R.id.name_Field_1;
import static com.example.android.whatkindofcandydoyouwant.R.id.name_Field_2;
import static com.example.android.whatkindofcandydoyouwant.R.id.name_Field_3;

/**
 * This app displays is a quiz about candy prefrences
 */
public class MainActivity extends ActionBarActivity {

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
        //figure out the customers name
        EditText name_Field_1 = (EditText) findViewById(R.id.name_Field_1);
        String name = name_Field_1.getText().toString();
        Log.v("MainActivity", "Name: " + name_Field_1);

        EditText name_Field_2 = (EditText) findViewById(R.id.name_Field_2);
        String name2 = name_Field_2.getText().toString();
        Log.v("MainActivity", "Other: " + name_Field_2);

        EditText name_Field_3 = (EditText) findViewById(R.id.name_Field_3);
        String name3 = name_Field_3.getText().toString();
        Log.v("MainActivity", "Other: " + name_Field_3);

        //figure out if the person prefers M&M's
        CheckBox mmsCheckbox = (CheckBox) findViewById(R.id.mms_checkbox);
        boolean wantsMMS = mmsCheckbox.isChecked();
        Log.v("MainActivity", "M&Ms: " + wantsMMS);

        //figure out if the person prefers skittles
        CheckBox skittlesCheckbox = (CheckBox) findViewById(R.id.skittles_checkbox);
        boolean wantsSkittles = skittlesCheckbox.isChecked();
        Log.v("MainActivity", "Skittles: " + wantsSkittles);

        //figure out if the person prefers snickers
        CheckBox snickersCheckbox = (CheckBox) findViewById(R.id.snickers_checkbox);
        boolean wantsSnickers = snickersCheckbox.isChecked();
        Log.v("MainActivity", "Snickers: " + wantsSnickers);

        //figure out if the person prefers butterfinger
        CheckBox butterfingerCheckbox = (CheckBox) findViewById(R.id.butterfinger_checkbox);
        boolean wantsButterfinger = butterfingerCheckbox.isChecked();
        Log.v("MainActivity", "Butterfinger: " + wantsButterfinger);

        //figure out if the person prefers milk chocolate
        CheckBox milkChocolateCheckbox = (CheckBox) findViewById(R.id.milk_chocolate_checkbox);
        boolean wantsMilkChocolate = milkChocolateCheckbox.isChecked();
        Log.v("MainActivity", "Milk Chocolate: " + wantsMilkChocolate);

        //figure out if the person prefers dark chocolate
        CheckBox darkChocolateCheckbox = (CheckBox) findViewById(R.id.dark_chocolate_checkbox);
        boolean wantsDarkChocolate = darkChocolateCheckbox.isChecked();
        Log.v("MainActivity", "DarkChocolate: " + wantsDarkChocolate);
    }

    /**
     * creates priceMessage
     *
     * @param name               of the customer
     * @param price
     * @param wantsMMS           whether person prefers M&Ms
     * @param wantsSkittles      whether person prefers Skittles
     * @param wantsSnickers      whether person prefers Snickers
     * @param wantsButterfinger  whether person prefers Butterfinger
     * @param wantsDarkChocolate whether person prefers Dark Chocolate
     * @param wantsMilkChocolate whether person prefers MilkChocolate
     * @return
     */
    private String priceMessage(String name, int price, boolean wantsMMS, boolean wantsSkittles, boolean wantsSnickers, boolean wantsButterfinger, boolean wantsDarkChocolate, boolean wantsMilkChocolate) {
        String priceMessage = "Name: " + name_Field_1;
        priceMessage += "\nM&M's " + wantsMMS;
        priceMessage += "\nSkittles? " + wantsSkittles;
        priceMessage += "\nOther? " + name_Field_2;
        priceMessage += "\nSnickers? " + wantsSnickers;
        priceMessage += "\nButterfinger? " + wantsButterfinger;
        priceMessage += "\nOther? " + name_Field_3;
        priceMessage += "\nDarkChocolate? " + wantsDarkChocolate;
        priceMessage += "\nMilk Chocolate? " + wantsMilkChocolate;
        return priceMessage;
    }

}