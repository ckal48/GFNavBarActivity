package com.example.gfnavbaractivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class profile2 extends Fragment {
    Button mButton;
    EditText text1, text2, text3, text4;
    String st1, st2, st3,st4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.activity_profile2, container, false);

        mButton = view.findViewById(R.id.button2);
        EditText text1 = view.findViewById(R.id.text1);
        EditText text2 = view.findViewById(R.id.text2);
        EditText text3 = view.findViewById(R.id.text3);
        EditText text4 = view.findViewById(R.id.text4);

        mButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.navigation_profile, null));
        Intent one = new Intent(getActivity(), ProfileFragment.class);
        Intent two = new Intent(getActivity(), ProfileFragment.class);
        Intent three = new Intent(getActivity(), ProfileFragment.class);
        Intent four = new Intent(getActivity(), ProfileFragment.class);
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

        return view;
    }
}
