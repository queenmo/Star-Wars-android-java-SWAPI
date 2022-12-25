package dian.pnp.ac.id.starwars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class SpaceshipsActivity extends AppCompatActivity {

    private static final String STATS_URL = "https://swapi.dev/api/starships/";
    RecyclerView rcdata;
    ArrayList<SpaceshipModel> dataArrayList;
    SpaceshipAdapter spaceshipAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spaceships);

        dataArrayList = new ArrayList<>();

        rcdata = findViewById(R.id.recystat);
        rcdata.setLayoutManager(new LinearLayoutManager(this));
        rcdata.setHasFixedSize(true);
    }

    @Override
    protected void onResume() {
        super.onResume();
        prosesdata();
    }

    private void prosesdata(){

        StringRequest stringRequest = new StringRequest(Request.Method.GET, STATS_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                handlerespon(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(SpaceshipsActivity.this, ""+error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void handlerespon(String response) {

        dataArrayList = new ArrayList<>();
        dataArrayList.clear();

        try{

            JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("results");

            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.setDateFormat("dd/MM/yyyy hh:mm a");
            Gson gson = gsonBuilder.create();

            for (int i=0; i<jsonArray.length(); i++){

                JSONObject obj = jsonArray.getJSONObject(i);

                SpaceshipModel SpaceshipModel = new SpaceshipModel(
                        obj.getString("name"),
                        obj.getString("model"),
                        obj.getString("manufacturer"),
                        obj.getString("max_atmosphering_speed"),
                        obj.getString("crew"),
                        obj.getString("passengers"));

                dataArrayList.add(SpaceshipModel);
            }

            spaceshipAdapter = new SpaceshipAdapter(SpaceshipsActivity.this, dataArrayList);
            rcdata.setAdapter(spaceshipAdapter);
            spaceshipAdapter.notifyDataSetChanged();

        }
        catch (Exception e){
            Toast.makeText(SpaceshipsActivity.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}