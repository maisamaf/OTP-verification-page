package com.example.phoneverificationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.chaos.view.PinView;

public class MainActivity extends AppCompatActivity {

    PinView pinView;
    String code;
    Button btnVerify;
    TextView topText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pinView = findViewById(R.id.pinView);
        btnVerify = findViewById(R.id.btnVerifyCode);
        topText = findViewById(R.id.topText);

        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = pinView.getText().toString();
                if (code.isEmpty() || code.length() <6 ){
                    pinView.setLineColor(Color.RED);
                    topText.setText("Wrong code, try again!");
                    topText.setTextColor(Color.RED);
                    pinView.setText(""); // make the pinView empty
                } else {
                    pinView.setLineColor(Color.GREEN);
                    topText.setText("Code Verified!");
                    topText.setTextColor(Color.GREEN);
                }
            }
        });

    }
}