package com.flavourbasket.flavourbasket;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Extra_fragment extends Fragment {

    CardView aboutus,contactus,terms;
    public Extra_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_extra_fragment, container, false);
        aboutus =view.findViewById(R.id.about_us);
        contactus=view.findViewById(R.id.contact_us);
        terms=view.findViewById(R.id.term_and_condition);
        aboutclick();
        contactclick();
        termclick();



        return view;
    }
    public void aboutclick()
    {
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft=getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.extras,new Aboutus_Fragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });
    }
    public void contactclick()
    {
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft=getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.extras,new Contactus_Fragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });
    }
    public void termclick()
    {
        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft=getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.extras,new Terms_fragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });
    }


}
