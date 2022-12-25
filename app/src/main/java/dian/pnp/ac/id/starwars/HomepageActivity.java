package dian.pnp.ac.id.starwars;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomepageActivity extends AppCompatActivity {
    private static final String TAG = "HomepageActivity";
    private CardView films,planets,spaceships,vehicles,people,species;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        films = findViewById(R.id.films);
        films.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomepageActivity.this,FilmsActivity.class));

            }
        });

        planets = findViewById(R.id.planets);
        planets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomepageActivity.this,PlanetsActivity.class));

            }
        });

        spaceships = findViewById(R.id.spaceships);
        spaceships.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomepageActivity.this,SpaceshipsActivity.class));

            }
        });

        vehicles = findViewById(R.id.vehicles);
        vehicles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomepageActivity.this,VehiclesActivity.class));

            }
        });

        people = findViewById(R.id.people);
        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomepageActivity.this,PeopleActivity.class));

            }
        });

    }

}
