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

        try {
            button = (Button) (view.findViewById(R.id.button));
            name = (TextView) (view.findViewById(R.id.name));
            major = (TextView) (view.findViewById(R.id.major));
            motto = (TextView) (view.findViewById(R.id.motto));
            description = (TextView) (view.findViewById(R.id.description));
            st1 = (String) getActivity().getIntent().getExtras().getString("your_name");
            st2 = (String) getActivity().getIntent().getExtras().getString("your_major");
            st3 = (String) getActivity().getIntent().getExtras().getString("your_words_to_live_by");
            st4 = (String) getActivity().getIntent().getExtras().getString("fill_in");
            name.setText(st1);
            major.setText(st2);
            motto.setText(st3);
            description.setText(st4);


            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity2();
                }
            });
        }catch(Exception e) {
            //There was an error
        }

        return view;
    }

    public void openActivity2(){
        Intent intent = new Intent(ProfileFragment.this.getActivity(), profile2.class);
        startActivity(intent);
    }

}
