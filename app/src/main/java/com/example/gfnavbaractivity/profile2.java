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
    Button mButton;
    EditText text1, text2, text3, text4;
    String st1, st2, st3,st4;

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
                Intent one = new Intent(profile2.this, ProfileFragment.class);
                Intent two = new Intent(profile2.this, ProfileFragment.class);
                Intent three = new Intent(profile2.this, ProfileFragment.class);
                Intent four = new Intent(profile2.this, ProfileFragment.class);
                st1 = text1.getText().toString();
                st2 = text2.getText().toString();
                st3 = text3.getText().toString();
                st4 = text4.getText().toString();
                one.putExtra("your_name", st1);
                two.putExtra("your_major", st2);
                three.putExtra("your_words_to_live_by", st3);
                four.putExtra("fill_in", st4);
                startActivity(one);
                startActivity(two);
                startActivity(three);
                startActivity(four);
                finish();
            }
        });
    }
}
