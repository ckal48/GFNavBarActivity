package com.example.gfnavbaractivity;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //code for create button in Session layout
        createButton = (Button) findViewById(R.id.createButton);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateButtonActivity();
            }
        });




        final BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);



        /*NavController navController = new NavController((this.getApplicationContext()));
        //not sure if navcontroller is properly instantiated
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller,
                                             @NonNull NavDestination destination, @Nullable Bundle arguments) {
                if(destination.getId() == R.id.action_navigation_schedule_to_navigation_addClass) {
                    bottomNav.setVisibility(View.GONE);
                }
                else {
                    bottomNav.setVisibility(View.VISIBLE);
                }
            }
        });

         */
        //makes the bottomnavbar disappear when on add class screen

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new StartFragment()).commit();

        Toast startmessage = Toast.makeText(getApplicationContext(), "Welcome to GrizzFinder! Click to continue",Toast.LENGTH_LONG);
        startmessage.setGravity(Gravity.BOTTOM,0,250);
        startmessage.show();
    }

    public void openCreateButtonActivity() {
        Intent intent = new Intent(this, CreateButtonActitivity.class);
        startActivity(intent);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.navigation_schedule:
                            selectedFragment = new ScheduleFragment();
                            break;
                        case R.id.navigation_profile:
                            selectedFragment = new ProfileFragment();
                            break;
                        case R.id.navigation_map:
                            selectedFragment = new MapFragment();
                            break;
                        case R.id.navigation_session:
                            selectedFragment = new SessionFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;


                }
            };



}

