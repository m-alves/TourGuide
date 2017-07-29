package com.example.android.santacatarinasitimos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ToEatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_of_interest);

        // Create a list of Interests
        ArrayList<Interest> pInt = new ArrayList<Interest>();

        pInt.add(new Interest(R.string.to_eat_location_1_name, R.string.to_eat_location_1_description, R.string.to_eat_location_1_contact,
                R.drawable.cafeana));
        pInt.add(new Interest(R.string.to_eat_location_2_name, R.string.to_eat_location_2_description, R.string.to_eat_location_2_contact,
                R.drawable.mondina));
        pInt.add(new Interest(R.string.to_eat_location_3_name, R.string.to_eat_location_3_description, R.string.to_eat_location_3_contact,
                R.drawable.escola));
        pInt.add(new Interest(R.string.to_eat_location_4_name, R.string.to_eat_location_4_description, R.string.to_eat_location_4_contact,
                R.drawable.rola));
        pInt.add(new Interest(R.string.to_eat_location_5_name, R.string.to_eat_location_5_description, R.string.to_eat_location_5_contact,
                R.drawable.cantinho));

        // Create an {@link InterestAdapter}, whose data source is a list of {@link Interests}s. The
        // adapter knows how to create list items for each item in the list.
        InterestAdapter adapter = new InterestAdapter(this, pInt);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById(R.id.point_of_interest_list);
        listView.setAdapter(adapter);
    }
}
