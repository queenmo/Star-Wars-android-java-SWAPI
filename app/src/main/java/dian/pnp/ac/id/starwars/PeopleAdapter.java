package dian.pnp.ac.id.starwars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.RecyclerHolder> {

    private Context context;
    public ArrayList<PeopleModel> dataArrayList;

    public PeopleAdapter(Context context, ArrayList<PeopleModel> dataArrayList) {
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

        PeopleModel peopleModel = dataArrayList.get(position);

        String Name = peopleModel.getName();
        String Height = peopleModel.getHeight();
        String Mass = peopleModel.getMass();
        String Skin_color = peopleModel.getSkin_color();
        String Birth_year = peopleModel.getBirth_year();
        String Gender = peopleModel.getGender();

        System.out.println("Name: " + Name);
        System.out.println("Height: " + Height);


        holder.tv1.setText(Name);
        holder.tv2.setText(Height);
        holder.tv3.setText(Mass);
        holder.tv4.setText(Skin_color);
        holder.tv5.setText(Birth_year);
        holder.tv6.setText(Gender);


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