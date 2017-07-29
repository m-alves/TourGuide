package com.example.android.santacatarinasitimos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SurroundingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_of_interest);

        // Create a list of Interests
        ArrayList<Interest> pInt = new ArrayList<Interest>();

        pInt.add(new Interest(R.string.surroundings_location_1_name, R.string.surroundings_location_1_description, R.drawable.barragem));
        pInt.add(new Interest(R.string.surroundings_location_2_name, R.string.surroundings_location_2_description, R.drawable.alcacer));
        pInt.add(new Interest(R.string.surroundings_location_3_name, R.string.surroundings_location_3_description,  R.drawable.santasusana));




        // Create an {@link InterestAdapter}, whose data source is a list of {@link Interests}s. The
        // adapter knows how to create list items for each item in the list.
        InterestAdapter adapter = new InterestAdapter(this, pInt);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.point_of_interest_list);

        // Make the {@link ListView} use the {@link InterestAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}