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
import androidx.navigation.Navigation;

public class ProfileFragment extends Fragment {
    Button button;
    TextView name, major, motto, description;
    String st1, st2, st3, st4;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.profile, container, false);

        try {
            button = view.findViewById(R.id.button);
            name = view.findViewById(R.id.name);
            major = view.findViewById(R.id.major);
            motto = view.findViewById(R.id.motto);
            description = view.findViewById(R.id.description);
            st1 = getActivity().getIntent().getExtras().getString("your_name");
            st2 = getActivity().getIntent().getExtras().getString("your_major");
            st3 = getActivity().getIntent().getExtras().getString("your_words_to_live_by");
            st4 = getActivity().getIntent().getExtras().getString("fill_in");
            name.setText(st1);
            major.setText(st2);
            motto.setText(st3);
            description.setText(st4);


            button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.navigation_profile2, null));

        }catch(Exception e) {
            //There was an error
        }

        return view;
    }
}
