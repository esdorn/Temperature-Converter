package com.nchsprograming.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean swap = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateTemperature(View view) {


    }
    public void Swap(View view) {
        TextView textView = findViewById(R.id.textView2);
        if (swap) {
            textView.setText("Celsius > Fahrenheit");
            swap = false;
        }
        else {
            textView.setText("Fahrenheit > Celsius");
            swap = true;
        }
    }
}
