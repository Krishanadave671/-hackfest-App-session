package com.example.hackfest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    TextInputLayout name , year , branch ;
    Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        name = findViewById(R.id.textField);
        year = findViewById(R.id.textField2);
        branch = findViewById(R.id.textField3);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String studentName = name.getEditText().getText().toString();
                String studentyear= year.getEditText().getText().toString();
                String studentbranch = branch.getEditText().getText().toString();
                String text = "Hello guys ! my name is " + studentName + "\n I am from " + studentyear + " studying in " + studentbranch +
                        " I made my first app today It was amazing 🥳🥳🥳💖";
                Toast.makeText(MainActivity.this, "Hello my name is" + studentName + " " + studentyear + " " + studentbranch , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this , MainActivity2.class);
                i.putExtra("text" , text );
                startActivity(i);

            }
        });




    }
}