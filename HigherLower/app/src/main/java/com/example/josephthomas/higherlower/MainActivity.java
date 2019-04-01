package com.example.josephthomas.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randNumber;

    public void whenClick(View view)

    {
        EditText editText = (EditText) findViewById(R.id.editText);
        String value = editText.getText().toString();

        int i = Integer.parseInt(value);

        if(i > randNumber){
            Toast.makeText(MainActivity.this, "Lower!", Toast.LENGTH_SHORT).show();
        }
        else if (i < randNumber){
            Toast.makeText(MainActivity.this, "Higher!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "That's right! Try again!", Toast.LENGTH_SHORT).show();

            Random rand = new Random();

            randNumber = rand.nextInt(20) + 1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random r = new Random();
        randNumber = r.nextInt(20) + 1;
    }
}
