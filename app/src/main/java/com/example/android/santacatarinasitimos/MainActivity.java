package com.example.android.santacatarinasitimos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the toStay category
        TextView toStay = (TextView) findViewById(R.id.to_stay);

        // Set a click listener on that View
        toStay.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the toStay category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ToStayActivity}
                Intent toStayIntent = new Intent(MainActivity.this, ToStayActivity.class);
                // Start the new activity
                startActivity(toStayIntent);
            }
        });

        // Find the View that shows the toEat category
        TextView toEat = (TextView) findViewById(R.id.to_eat);

        // Set a click listener on that View
        toEat.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the toEat category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ToEatActivity}
                Intent toEatIntent = new Intent(MainActivity.this, ToEatActivity.class);
                // Start the new activity
                startActivity(toEatIntent);
            }
        });

        // Find the View that shows the toDo1 category
        TextView toDo = (TextView) findViewById(R.id.to_do);

        // Set a click listener on that View
        toDo.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the toDo1 category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ToDoActivity}
                Intent toDoIntent = new Intent(MainActivity.this, ToDoActivity.class);
                // Start the new activity
                startActivity(toDoIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView surroundings = (TextView) findViewById(R.id.surroundings);

        // Set a click listener on that View
        surroundings.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the surroundings category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SurroundingsActivity}
                Intent surroundingsIntent = new Intent(MainActivity.this, SurroundingsActivity.class);
                // Start the new activity
                startActivity(surroundingsIntent);
            }
        });
    }
}

