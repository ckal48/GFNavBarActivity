package com.example.gfnavbaractivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;

import java.util.ArrayList;

import static androidx.navigation.Navigation.createNavigateOnClickListener;

public class ScheduleFragment extends Fragment {

    Button addButton;
    Button delButton;

    EditText et;
    EditText et2;
    Button bt;
    ListView lv;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    Course newCourse;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.schedule, container, false);
        //make schedule layout appear

        et = view.findViewById(R.id.typedata);
        et2 = view.findViewById(R.id.typedata2);
        bt = view.findViewById(R.id.submitClassForReal);
        lv = view.findViewById(R.id.classesList);

        arrayList = new ArrayList<>();
        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, arrayList);
        lv.setAdapter(adapter);

        onBtnClick();

        addButton = view.findViewById(R.id.addClassBtn);
        addButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_navigation_schedule_to_navigation_addClass, null));
        //switch schedule layout to add class layout

        delButton = view.findViewById(R.id.deleteClassBtn);
        delButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(arrayList.size() != 0) {
                    arrayList.remove(arrayList.size() - 1);
                    adapter.notifyDataSetChanged();
                }
            }
        });
        //remove last class inputted

        return view;
        //Inflate schedule layout
    }

    public void onBtnClick(){
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Course c = new Course(et.getText().toString(), et2.getText().toString());
                String result = c.makeListItem();
                arrayList.add(result);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
