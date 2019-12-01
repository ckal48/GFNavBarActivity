package com.example.gfnavbaractivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import static androidx.navigation.Navigation.createNavigateOnClickListener;

public class ScheduleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.schedule, container, false);
        //make schedule layout appear
        /*final String[] classes = {"Math 101",
                            "Science 300",
                            "English 213",
                            "Geography 500"};

        ListView listView =  view.findViewById(R.id.classesList);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                classes
        );

        listView.setAdapter(listViewAdapter);
        */
        //display manual class input

        Button mButton = view.findViewById(R.id.addClassBtn);
        mButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_navigation_schedule_to_navigation_addClass, null));
        //switch schedule layout to add class layout




        return view;
        //Inflate schedule layout
    }
}
