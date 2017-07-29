package com.example.android.santacatarinasitimos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ToStayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_of_interest);

        // Create a list of Interests
        ArrayList<Interest> pInt = new ArrayList<Interest>();

        pInt.add(new Interest(R.string.to_stay_location_1_name, R.string.to_stay_location_1_description, R.string.to_stay_location_1_distance ,
                R.string.to_eat_location_1_contact, R.drawable.arrais));
        pInt.add(new Interest(R.string.to_stay_location_2_name, R.string.to_stay_location_2_description, R.string.to_stay_location_2_distance ,
                R.string.to_eat_location_2_contact, R.drawable.pousada));
        pInt.add(new Interest(R.string.to_stay_location_3_name, R.string.to_stay_location_3_description, R.string.to_stay_location_3_distance ,
                R.string.to_eat_location_3_contact, R.drawable.ameira));
        pInt.add(new Interest(R.string.to_stay_location_4_name, R.string.to_stay_location_4_description, R.string.to_stay_location_4_distance ,
                R.string.to_eat_location_4_contact, R.drawable.barrosinha));

        // Create an {@link InterestAdapter}, whose data source is a list of {@link Interests}s. The
        // adapter knows how to create list items for each item in the list.
        InterestAdapter adapter = new InterestAdapter(this, pInt);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById(R.id.point_of_interest_list);
        listView.setAdapter(adapter);
    }
}
