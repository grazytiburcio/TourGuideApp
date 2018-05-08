package com.example.grazy.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlacesAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Places} objects.
 */
public class PlacesAdapter extends ArrayAdapter<Places> {

    /**
     * Create a new {@link PlacesAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places  is the list of {@link Places} to be displayed.
     */
    public PlacesAdapter(Activity context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Places} object located at this position in the list
        Places currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID place_name.
        TextView placeNameTextView = (TextView) listItemView.findViewById(R.id.place_name);
        // Get the name of the place from the currentPlace object and set this text on
        // the place_name TextView.
        placeNameTextView.setText(currentPlace.getPlaceName());

        // Find the ImageView in the list_item.xml layout with the ID place_image.
        ImageView placeImageView = (ImageView) listItemView.findViewById(R.id.place_image);
        // Get the image of the place from the currentPlace object and set this image on
        // the place_image ImageView.
        placeImageView.setImageResource(currentPlace.getImageResourceId());

        // Return the whole list item layout (containing 1 TextView and 1 ImageView) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}