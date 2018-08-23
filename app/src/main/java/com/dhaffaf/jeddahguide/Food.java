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

public class Food  extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.food_tab, container, false);

        // Create a list of food info
        ArrayList<Info> eat = new ArrayList<Info>();
        eat.add(new Info(R.string.khayal_rest,R.string.khayal,R.drawable.khayal) );
        eat.add(new Info(R.string.waga_rest,R.string.wagamama,R.drawable.wagamama));

        // Create an {adapter, whose data source is a list of food tab.
        ListVuewAdapter listAdapter = new ListVuewAdapter(getContext() , eat) ;
        // Find the listView object in the view hierarchy of the foodList
        ListView listView = (ListView) view.findViewById(R.id.foodList) ;
        // Make the listView use the adapter we created above
        listView.setAdapter(listAdapter);
        return view;
    }
}
