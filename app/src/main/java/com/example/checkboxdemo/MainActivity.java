package com.example.checkboxdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private CheckBox pizza;
    private CheckBox cofee;
    private CheckBox burger;
    private Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButtonClick();

    }

    public void addListenerOnButtonClick() {

        pizza = findViewById(R.id.checkbox1);
        cofee = findViewById(R.id.checkbox2);
        burger = findViewById(R.id.checkbox3);
        buttonOrder = findViewById(R.id.btn1);

        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalamount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected Item:");
                if (pizza.isChecked()) {
                    result.append("\n pizza 100Rs:");
                    totalamount += 100;
                }
                if (cofee.isChecked()) {
                    result.append("\n cofee 50Rs");
                    totalamount += 50;
                }
                if (burger.isChecked()) {
                    result.append("\n burger 120Rs");
                    totalamount += 120;
                }
                result.append("\n Total" + totalamount + "Rs");

                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}







