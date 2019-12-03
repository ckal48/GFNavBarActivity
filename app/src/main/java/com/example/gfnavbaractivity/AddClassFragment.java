package com.example.gfnavbaractivity;

import android.app.TimePickerDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;


public class AddClassFragment extends Fragment implements TimePickerDialog.OnTimeSetListener {
    //implements TimePickerDialog.OnTimeSetListener
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_class, container, false);
        //content to make add class layout appear


        Button mButton = view.findViewById(R.id.cancelClassBtn);
        mButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_navigation_addClass_to_navigation_schedule, null));
        //cancel class button returns to schedule screen


        Button startTimePickerButton = view.findViewById(R.id.startTimer);
        startTimePickerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                DialogFragment startTimePicker = new TimePickerFragment();
                startTimePicker.show(getFragmentManager(), "time picker" );
            }
        });//create time picker

        Switch mSwitch = view.findViewById(R.id.switchMonday);
        Switch tSwitch = view.findViewById(R.id.switchTuesday);
        Switch wSwitch = view.findViewById(R.id.switchWednesday);
        Switch rSwitch = view.findViewById(R.id.switchThursday);
        Switch fSwitch = view.findViewById(R.id.switchFriday);
        Switch sASwitch = view.findViewById(R.id.switchSaturday);
        Switch sUSwitch = view.findViewById(R.id.switchSunday);

        //instantiate all input data



        //Course inputClass = new Course(edit text input, mSwitch.isChecked(), tSwitch.isChecked(), wSwitch.isChecked(),
        //        rSwitch.isChecked(), fSwitch.isChecked(), sASwitch.isChecked(), sUSwitch.isChecked(),
        //        start time input, end time input);
        //create course object based off of input information


        return view;
        //make add class layout appear
    }



    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TextView startTextView = view.findViewById(R.id.startTimeText);
        startTextView.setText("Hour: "+ hourOfDay + "Minute: "+ minute);

    }//use these values to do whatever you want (they are used to display in textviews
}
