package com.example.midtermmdp;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewTitle;
    TextView textViewResult;
    Button buttonPush;
    TextInputEditText textName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = (TextView) findViewById(R.id.textViewResult);
        buttonPush = (Button) findViewById(R.id.buttonPush);
        textName = (TextInputEditText) findViewById(R.id.textName);
        textViewTitle = (TextView) findViewById(R.id.textViewTitle);

        buttonPush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name;
                String result;

                name = textName.getText().toString();
                result = name + " is a great android programmer!!";

                textViewResult.setText(result);
            }
        });
    }
}
