package com.dhaffaf.jeddahguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by WIN8 on 25/12/17.
 */

public class Historical  extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.history_tab, container, false);

        // Create a list of history info
        ArrayList<Info> history = new ArrayList<Info>();
        history.add(new Info(R.string.fountain,R.string.about_fountain,R.drawable.fountain) );
        history.add(new Info(R.string.museum,R.string.about_museum,R.drawable.museum));

        // Create an {adapter, whose data source is a list of history tab.
        ListVuewAdapter listAdapter = new ListVuewAdapter(getContext() , history) ;
        // Find the listView object in the view hierarchy of the historyList
        ListView listView = (ListView) view.findViewById(R.id.historyList) ;
        // Make the listView use the adapter we created above
        listView.setAdapter(listAdapter);
        return view;
    }
}
