package com.example.grade_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText prelim, midterm , prefinal , finals ;
    Button clearButton, CalculatorButton;
    TextView averageView;
    Double num1,num2,num3,num4 , averagedouble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EditText
        prelim =   findViewById(R.id.prelimEditText);
        midterm =  findViewById(R.id.midtermEditText);
        prefinal = findViewById(R.id.prefinalEditText);
        finals = findViewById(R.id.finalEditText);

        //Buttons
        clearButton = findViewById(R.id.ClearButton);
        CalculatorButton = findViewById(R.id.CalculateButton);

        //TextView
        averageView = findViewById(R.id.averageTextView);

        CalculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Double.parseDouble(prelim.getText().ToString());
                num2 =Double.parseDouble(midterm.getText().ToString());
                num3 =Double.parseDouble(prefinal.getText().ToString());
                num4 =Double.parseDouble(finals.getText().ToString());

                //computeAverage
                averagedouble = ((num1 * .20) + (num2 * .20) + (num3 * .20) + (num4 * .40));

                averageView.setText(averagedouble.ToString());
            }
        });

    }
}