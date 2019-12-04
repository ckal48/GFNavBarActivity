package com.example.gfnavbaractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class profile2 extends AppCompatActivity {
    private Button mButton;
    private EditText text1, text2, text3, text4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

        mButton = (Button) findViewById(R.id.button2);
        final EditText text1 = (EditText) findViewById(R.id.text1);
        final EditText text2 = (EditText) findViewById(R.id.text2);
        final EditText text3 = (EditText) findViewById(R.id.text3);
        final EditText text4 = (EditText) findViewById(R.id.text4);

        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.v("EditText", text1.getText().toString());
                Log.v("EditText", text2.getText().toString());
                Log.v("EditText", text3.getText().toString());
                Log.v("EditText", text4.getText().toString());
            }
        });
    }
}
