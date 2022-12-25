package dian.pnp.ac.id.starwars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SpeciesAdapter extends RecyclerView.Adapter<SpeciesAdapter.RecyclerHolder> {

    private Context context;
    public ArrayList<SpeciesModel> dataArrayList;

    public SpeciesAdapter(Context context, ArrayList<SpeciesModel> dataArrayList) {
        this.context = context;
        this.dataArrayList = dataArrayList;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_species, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {

        SpeciesModel speciesModel = dataArrayList.get(position);

        String Name = speciesModel.getName();
        String Classification = speciesModel.getClassification();
        String Designation = speciesModel.getDesignation();
        String Average_height = speciesModel.getAverage_height();
        String Skin_colors = speciesModel.getSkin_colors();
        String Average_lifespan = speciesModel.getAverage_lifespan();

        System.out.println("Name: "+Name);
        System.out.println("Classification: "+Classification);

        holder.tv1.setText(Name);
        holder.tv2.setText(Classification);
        holder. tv3.setText(Designation);
        holder. tv4.setText(Average_height);
        holder. tv5.setText(Skin_colors);
        holder. tv6.setText(Average_lifespan);

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