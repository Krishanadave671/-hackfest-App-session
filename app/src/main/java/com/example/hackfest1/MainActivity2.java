package com.example.hackfest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    // Declaring variables
    Button button2 ;
    TextView textView2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // find by id
        button2 = findViewById(R.id.button2);
        textView2 = findViewById(R.id.textView2);

        // getIntent -- received data from previous activity .
        Intent intent = getIntent();
        // getting data by adding key
        String text = intent.getStringExtra("text");

        textView2.setText(text);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to share result
                Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
                whatsappIntent.setType("text/plain");
                whatsappIntent.putExtra(Intent.EXTRA_TEXT, text);
                startActivity(whatsappIntent);

            }
        });


    }
}