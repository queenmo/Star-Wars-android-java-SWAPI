package dian.pnp.ac.id.starwars;

import com.google.gson.annotations.SerializedName;

public class FilmModel {
    
    @SerializedName("title")
    private String title;

    @SerializedName("episode_id")
    private String episode_id;

    @SerializedName("opening_crawl")
    private String opening_crawl;

    @SerializedName("director")
    private String director;

    @SerializedName("producer")
    private String producer;

    @SerializedName("release_date")
    private String release_date;


    public FilmModel(String title, String episode_id, String opening_crawl, String director,
                     String producer, String release_date){

        this.title = title;
        this.episode_id = episode_id;
        this.opening_crawl = opening_crawl;
        this.director = director;
        this.producer = producer;
        this.release_date = release_date;
    }

    public String getTitle() { return title; }
    public String getEpisode_id() { return episode_id; }
    public String getOpening_crawl() { return opening_crawl; }
    public String getDirector() { return director; }
    public String getProducer() { return producer; }
    public String getRelease_date()  { return release_date; }
}

