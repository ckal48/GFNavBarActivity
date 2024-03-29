package com.example.gfnavbaractivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class SessionFragment extends Fragment {

    Button sessionCreate;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.session, container, false);


        sessionCreate= view.findViewById(R.id.createButton);
        sessionCreate.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.navigation_session_create, null));

        return view;
    }
}
