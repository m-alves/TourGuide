package com.example.android.santacatarinasitimos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link InterestAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Interest} objects.
 */
public class InterestAdapter extends ArrayAdapter<Interest> {

    /**
     * Create a new {@link InterestAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param pInt is the list of {@link Interest}s to be displayed.
     * source ID for the background color for this list of interests
     */
    public InterestAdapter(Context context,  ArrayList<Interest> pInt) {
        super(context, 0, pInt);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        // Get the {@link Interest} object located at this position in the list
        Interest currentInterest = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // Get the name from the currentInterest object and set this text on
        // the name TextView.
        nameTextView.setText(currentInterest.getNameResourceId());

        // Find the TextView in the list_item.xml layout with the ID description.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        // Get the description from the currentInterest object and set this text on
        // the description TextView.
        descriptionTextView.setText(currentInterest.getDescriptionResourceId());


        // Find the TextView in the list_item.xml layout with the ID distance.
        TextView distanceTextView = (TextView) listItemView.findViewById(R.id.distance);
        // Check if a distance is provided for this Interest or not
        if (currentInterest.hasDistance()) {
            // If a distance is available, display the provided distance based on the resource ID
            distanceTextView.setText(currentInterest.getDistanceResourceId());
            // Make sure the view is visible
            distanceTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            distanceTextView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID contact.
        TextView contactTextView = (TextView) listItemView.findViewById(R.id.contact);
        // Check if a contact is provided for this Interest or not
        if (currentInterest.hasContact()) {
            // If a contact is available, display the provided contact based on the resource ID
            contactTextView.setText(currentInterest.getContactResourceId());
            // Make sure the view is visible
            contactTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            contactTextView.setVisibility(View.GONE);
        }


        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image from the currentInterest object and set this image on
        // the image ImageView.
        imageView.setImageResource(currentInterest.getImageResourceId());

        // Return the whole list item layout (containing several TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
