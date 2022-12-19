package com.example.hackfest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    // Declaring variables
    TextInputLayout name , year , branch ;
    Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        // findbyid
        name = findViewById(R.id.textField);
        year = findViewById(R.id.textField2);
        branch = findViewById(R.id.textField3);
        button = findViewById(R.id.button);

        // clicklistener on button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // converting input variables to string
                String studentName = name.getEditText().getText().toString();
                String studentyear= year.getEditText().getText().toString();
                String studentbranch = branch.getEditText().getText().toString();
                String text = "Hello guys ! I am  " + studentName + "  from " + studentyear + " " + studentbranch +
                        "Today we'll be making the app that I have shown below 👇. Hope to see you guys there 🥳🥳🥰🥰";

                // Toast which means pop up

                // Intent code to change Activity
                Intent i = new Intent(MainActivity.this , MainActivity2.class);
                i.putExtra("text" , text );
                startActivity(i);

            }
        });




    }
}