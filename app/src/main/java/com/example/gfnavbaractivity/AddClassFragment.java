package com.example.gfnavbaractivity;

import android.app.TimePickerDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.ArrayList;

//import static com.example.gfnavbaractivity.ScheduleFragment.arrayList;
//import static com.example.gfnavbaractivity.ScheduleFragment.listViewAdapter;


public class AddClassFragment extends Fragment {
    EditText className;
    Switch mSwitch;
    Switch tSwitch;
    Switch wSwitch;
    Switch rSwitch;
    Switch fSwitch;
    Switch sASwitch;
    Switch sUSwitch;
    EditText classStart;
    EditText classEnd;

    Button submitBtn;
    Button cancelBtn;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_class, container, false);
        //content to make add class layout appear

        Button startTimePickerButton = view.findViewById(R.id.startTimer);
        startTimePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment startTimePicker = new TimePickerFragment();
                startTimePicker.show(getFragmentManager(), "time picker" );
            }
        });

        Button endTimePickerButton = view.findViewById(R.id.endTimer);
        endTimePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment endTimePicker = new TimePickerFragment();
                endTimePicker.show(getFragmentManager(), "time picker" );
            }
        });//create time pickers

        className = view.findViewById(R.id.classInputText);
        mSwitch = view.findViewById(R.id.switchMonday);
        tSwitch = view.findViewById(R.id.switchTuesday);
        wSwitch = view.findViewById(R.id.switchWednesday);
        rSwitch = view.findViewById(R.id.switchThursday);
        fSwitch = view.findViewById(R.id.switchFriday);
        sASwitch = view.findViewById(R.id.switchSaturday);
        sUSwitch = view.findViewById(R.id.switchSunday);
        //classStart = view.findViewById(R.id.classInputStart);
        //classEnd = view.findViewById(R.id.classInputEnd);
        //instantiate all input data

        submitBtn = view.findViewById(R.id.submitClassBtn);
        onSubmitClick();
        //create course class to be later inputted and return to schedule?

        cancelBtn = view.findViewById(R.id.cancelClassBtn);
        cancelBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_navigation_addClass_to_navigation_schedule, null));
        //cancel button returns to schedule screen

        return view;
        //make add class layout appear
    }

    public void onSubmitClick(){

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Course c = new Course(className.getText().toString(), classStart.getText().toString());
                ScheduleFragment s = new ScheduleFragment();
                s.newCourse = c;
            }
        });

        submitBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_navigation_addClass_to_navigation_schedule, null));
        //submit button returns to schedule screen
    }
}
