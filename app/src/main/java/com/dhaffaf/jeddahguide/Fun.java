package com.dhaffaf.jeddahguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by WIN8 on 25/12/17.
 */

public class Fun  extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fun_tab, container, false);
        // Create a list of fun info
        ArrayList<Info> fun = new ArrayList<Info>();
        fun.add(new Info(R.string.Faqiha,R.string.aquarium,R.drawable.park) );
        fun.add(new Info(R.string.water,R.string.front_sea,R.drawable.jeddah));
        fun.add(new Info(R.string.mall,R.string.red_sea,R.drawable.red));

        // Create an {adapter, whose data source is a list of fun tab.
        ListVuewAdapter listAdapter = new ListVuewAdapter(getContext() , fun) ;
        // Find the listView object in the view hierarchy of the funList
        ListView listView = (ListView) view.findViewById(R.id.funList) ;
        // Make the listView use the adapter we created above
        listView.setAdapter(listAdapter);
        return view;
    }
}
