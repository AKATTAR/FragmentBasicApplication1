package com.example.fragmentbasicapplication1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class simplefragment extends Fragment {
    Button firstbutton;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       view=inflater.inflate(R.layout.fragment_simple,container,false);
       firstbutton=view.findViewById(R.id.button);
       firstbutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getActivity(),"Hi Fragment is here!!!",Toast.LENGTH_SHORT).show();
           }
       });
       return view;
    }
}
