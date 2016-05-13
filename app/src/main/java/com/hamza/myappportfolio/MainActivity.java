package com.hamza.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void response(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        Toast.makeText(getBaseContext(), "This button will lunch my \"" + buttonText + "\" app!", Toast.LENGTH_SHORT).show();

    }
}
