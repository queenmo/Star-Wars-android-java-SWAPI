package dian.pnp.ac.id.starwars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.RecyclerHolder> {

    private Context context;
    public ArrayList<FilmModel> dataArrayList;

    public FilmAdapter(Context context, ArrayList<FilmModel> dataArrayList) {
        this.context = context;
        this.dataArrayList = dataArrayList;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_film, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {

        FilmModel filmModel = dataArrayList.get(position);

        String Title = filmModel.getTitle();
        String Episode_id = filmModel.getEpisode_id();
        String Opening_crawl = filmModel.getOpening_crawl();
        String Director = filmModel.getDirector();
        String Producer = filmModel.getProducer();
        String Release_date = filmModel.getRelease_date();

        System.out.println("Title: "+Title);
        System.out.println("Episode id: "+Episode_id);

        holder.tv1.setText(Title);
        holder.tv2.setText(Episode_id);
        holder. tv3.setText(Opening_crawl);
        holder. tv4.setText(Director);
        holder. tv5.setText(Producer);
        holder. tv6.setText(Release_date);


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
