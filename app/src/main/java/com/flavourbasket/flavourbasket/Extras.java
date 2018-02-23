package com.flavourbasket.flavourbasket;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Extras extends AppCompatActivity {
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras);
        ft=getSupportFragmentManager().beginTransaction();
        ft.add(R.id.extras,new Extra_fragment());
        ft.commit();
    }
}
