package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView text,text2;
 EditText editText;
 Button btn;
 int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=findViewById(R.id.text);
        editText=findViewById(R.id.editText);
        btn=findViewById(R.id.btn);
        text2=findViewById(R.id.text2);

        //adding functionalities
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //triggering a function to do the task
                //getting input from user
                String inputText= editText.getText().toString();
                //calling method
               int words= wordCounter(inputText);
                //displaying result
                text2.setText(""+words);

            }
        });
    }
    public int wordCounter(String inputText)
    {
        String[] arr= inputText.split("\\s+");
         return arr.length;

    }


    }
