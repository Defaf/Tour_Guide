package com.dhaffaf.jeddahguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by WIN8 on 25/12/17.
 */

public class ListVuewAdapter  extends ArrayAdapter<Info> {
    public ListVuewAdapter(@NonNull Context context, @NonNull List<Info> objects) {
        super(context, 0, objects);//call array adapter constructor
    }

    /**
     *
     * @param position The position in the list of data that should be displayed in the info list view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.info_list, parent, false);
        }
        // Get the locations object located at this position(Info) in the list
        Info locations = getItem(position);

        // Find the TextView in the info list.xml layout with the ID namePlace
        TextView locationNameTxtview =(TextView) listItemView.findViewById(R.id.namePlace);
        // Get the namePlace from the current locations object and set this text on the name TextView
        locationNameTxtview.setText(locations.getPlaceName());

        // Find the TextView in the info list.xml layout with the ID aboutPlace
        TextView locationAboutTxtview =(TextView) listItemView.findViewById(R.id.aboutPlace);
        // Get the aboutPlace from the current locations object and set this text on the name TextView
        locationAboutTxtview.setText(locations.getAboutPlace());

        // Find the TextView in the info list.xml layout with the ID photo
        ImageView locationImgview = (ImageView) listItemView.findViewById(R.id.photo) ;
        // Get the photo from the current locations object and set this text on the name TextView
        locationImgview.setImageResource(locations.getPlaceImage());

        return listItemView;
    }
}
