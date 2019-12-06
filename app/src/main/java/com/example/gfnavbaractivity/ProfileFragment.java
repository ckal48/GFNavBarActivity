package com.example.gfnavbaractivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {
    private Button button;
    private TextView name, major, motto, description;
    private String st1, st2, st3, st4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.profile, container, false);

        button = (Button) getView().findViewById(R.id.button);
        name = (TextView) getView().findViewById(R.id.name);
        major = (TextView) getView().findViewById(R.id.major);
        motto = (TextView) getView().findViewById(R.id.motto);
        description = (TextView) getView().findViewById(R.id.description);
        st1 = getIntent().getExtras().getString("your_name");
        st2 = getIntent().getExtras().getString("your_major");
        st3 = getIntent().getExtras().getString("your_words_to_live_by");
        st4 = getIntent().getExtras().getString("fill_in");
        name.setText(st1);
        major.setText(st2);
        motto.setText(st3);
        description.setText(st4);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity2();
            }
        });

        return view;
    }

    public void openActivity2(){
        Intent intent = new Intent(ProfileFragment.this.getActivity(), profile2.class);
        startActivity(intent);
    }

}
