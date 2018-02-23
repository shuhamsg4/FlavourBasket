package com.flavourbasket.flavourbasket;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
     DrawerLayout mdrawerlayout;
     ActionBarDrawerToggle mtoggle;
     NavigationView navigationView;
     BottomNavigationView mBottomNav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sideview();
    }
    public void sideview()
    {
        mdrawerlayout=(DrawerLayout)findViewById(R.id.drawer);
        mtoggle=new ActionBarDrawerToggle(this,mdrawerlayout,R.string.open,R.string.close);
        mdrawerlayout.addDrawerListener(mtoggle);
        mtoggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mBottomNav=(BottomNavigationView)findViewById(R.id.bottom_navigation) ;
        mBottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // handle desired action here
                // One possibility of action is to replace the contents above the nav bar
                // return true if you want the item to be displayed as the selected item
                switch (item.getItemId())
                {
                    case R.id.extra_id:
                        Intent i=new Intent(MainActivity.this,Extras.class);
                        startActivity(i);
                        break;
                }
                return true;
            }
        });




//        navigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId())
//                {
//                    case R.id.login:
//                        fm=getSupportFragmentManager().beginTransaction();
//                        fm.replace(R.id.fl,new LoginFragment(),"A");
//                        fm.addToBackStack(null);
//                        fm.commit();
//                        mdrawerlayout.closeDrawers();
//                        break;
//                    case R.id.registeration:
//                        FragmentManager fm = getSupportFragmentManager();
//                        FragmentTransaction ft=fm.beginTransaction();
//                        ft.replace(R.id.fl,new RegisteratioinFragment());
//                        ft.commit();
//                        ft.addToBackStack(null);
//                        mdrawerlayout.closeDrawers();
//                        break;
//                }
//                return true;
//            }
//        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mtoggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
