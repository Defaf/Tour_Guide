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

public class Education  extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.edu_tab, container, false);

        // Create a list of education info
        ArrayList<Info> eadu = new ArrayList<Info>();
        eadu.add(new Info(R.string.kua,R.string.about_KAU,R.drawable.kau) );
        eadu.add(new Info(R.string.effat,R.string.about_Effat,R.drawable.effat));

        // Create an {adapter, whose data source is a list of edu tab.
        ListVuewAdapter listAdapter = new ListVuewAdapter(getContext() , eadu) ;
        // Find the listView object in the view hierarchy of the eduList
        ListView listView = (ListView) view.findViewById(R.id.eduList) ;
        // Make the listView use the adapter we created above
        listView.setAdapter(listAdapter);
        return view;
    }
}
