package com.example.gfnavbaractivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class SessionFragment extends Fragment {

    Button sessionScreen;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.session, container, false);

        sessionScreen= view.findViewById(R.id.createButton);
        sessionScreen.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_navigation_session_to_navigation_activity_create_button_activity, null));

        return view;
    }
}
