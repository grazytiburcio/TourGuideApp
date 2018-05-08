package com.example.grazy.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of beaches in Armacao de Pera - Portugal.
 */
public class BeachesFragment extends Fragment {

    public BeachesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create an ArrayList of places
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.vale_olival_beach, R.drawable.beach_1));
        places.add(new Places(R.string.senhora_da_rocha_beach, R.drawable.beach_2));
        places.add(new Places(R.string.pescadores_beach, R.drawable.beach_3));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // places_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlacesAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Places} in the list.
        listView.setAdapter(adapter);

        // Return the whole list item layout (containing 1 TextView and an ImageView)
        // so that it can be shown in the ListView
        return rootView;
    }
}