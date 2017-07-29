package com.example.android.santacatarinasitimos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_of_interest);

        // Create a list of Interests
        ArrayList<Interest> pInt = new ArrayList<Interest>();

        pInt.add(new Interest(R.string.to_do_location_1_name, R.string.to_do_location_1_description, R.drawable.villaromana));
        pInt.add(new Interest(R.string.to_do_location_2_name, R.string.to_do_location_2_description, R.drawable.torre));
        pInt.add(new Interest(R.string.to_do_location_3_name, R.string.to_do_location_3_description,  R.drawable.festas));

        // Create an {@link InterestAdapter}, whose data source is a list of {@link Interests}s. The
        // adapter knows how to create list items for each item in the list.
        InterestAdapter adapter = new InterestAdapter(this, pInt);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById(R.id.point_of_interest_list);
        listView.setAdapter(adapter);
    }
}