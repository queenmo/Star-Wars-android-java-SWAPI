package dian.pnp.ac.id.starwars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SpaceshipAdapter extends RecyclerView.Adapter<SpaceshipAdapter.RecyclerHolder> {

    private Context context;
    public ArrayList<SpaceshipModel> dataArrayList;

    public SpaceshipAdapter(Context context, ArrayList<SpaceshipModel> dataArrayList) {
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

        SpaceshipModel spaceshipModel = dataArrayList.get(position);

        String Name = spaceshipModel.getName();
        String Model = spaceshipModel.getModel();
        String Manufacturer = spaceshipModel.getManufacturer();
        String Max_atmosphering_speed = spaceshipModel.getMax_atmosphering_speed();
        String Crew = spaceshipModel.getCrew();
        String Passengers = spaceshipModel.getPassengers();

        System.out.println("Name: "+Name);
        System.out.println("Model: "+Model);

        holder.tv1.setText(Name);
        holder.tv2.setText(Model);
        holder. tv3.setText(Manufacturer);
        holder. tv4.setText(Max_atmosphering_speed);
        holder. tv5.setText(Crew);
        holder. tv6.setText(Passengers);


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
