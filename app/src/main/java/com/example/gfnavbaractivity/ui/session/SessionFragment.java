package com.example.gfnavbaractivity.ui.session;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.gfnavbaractivity.R;

public class SessionFragment extends Fragment {

    private SessionViewModel sessionViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sessionViewModel = ViewModelProviders.of(this).get(SessionViewModel.class);
        View root = inflater.inflate(R.layout.session, container, false);
        final TextView textView = root.findViewById(R.id.text_session);
        sessionViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}