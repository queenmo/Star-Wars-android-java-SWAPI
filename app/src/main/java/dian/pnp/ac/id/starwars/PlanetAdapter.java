package dian.pnp.ac.id.starwars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.RecyclerHolder> {

    private Context context;
    public ArrayList<PlanetModel> dataArrayList;

    public PlanetAdapter(Context context, ArrayList<PlanetModel> dataArrayList) {
        this.context = context;
        this.dataArrayList = dataArrayList;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {

        PlanetModel planetModel = dataArrayList.get(position);

        String Name = planetModel.getName();
        String Rotation_period = planetModel.getRotation_period();
        String Orbital_period = planetModel.getOrbital_period();
        String Diameter = planetModel.getDiameter();
        String Climate = planetModel.getClimate();
        String Gravity = planetModel.getGravity();

        System.out.println("Name: "+Name);
        System.out.println("Rotation period: "+Rotation_period);

        holder.tv1.setText(Name);
        holder.tv2.setText(Rotation_period);
        holder. tv3.setText(Orbital_period);
        holder. tv4.setText(Diameter);
        holder. tv5.setText(Climate);
        holder. tv6.setText(Gravity);


    }

    @Override
    public int getItemCount() {
        if (dataArrayList == null) return 0;
        else {
            return dataArrayList.size();
        }
    }


    class RecyclerHolder extends RecyclerView.ViewHolder {

        TextView tv1, tv2, tv3, tv4, tv5, tv6;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);

            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);
            tv3 = itemView.findViewById(R.id.tv3);
            tv4 = itemView.findViewById(R.id.tv4);
            tv5 = itemView.findViewById(R.id.tv5);
            tv6 = itemView.findViewById(R.id.tv6);

        }
    }
}
