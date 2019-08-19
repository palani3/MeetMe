package com.example.meetme;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Maindata extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maindata);

        BottomNavigationView bottomnav=findViewById(R.id.bottom_navigaton);
        bottomnav.setOnNavigationItemSelectedListener(navListener) ;




    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;


                    switch (menuItem.getItemId()) {
                        case R.id.nav_home:
                            selectedFragment = new HomeFragement();
                            break;
                        case R.id.nav_chat:
                            selectedFragment = new ChatFragement();
                            break;
                        case R.id.nav_accout:
                            selectedFragment = new ProfileFragement();
                            break;

                    }
                    //getSupportFragmentManager().beginTransaction().replace(R.id.);
                    return true;
                }



            };
}
