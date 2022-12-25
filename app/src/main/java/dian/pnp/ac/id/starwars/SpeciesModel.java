package dian.pnp.ac.id.starwars;

import com.google.gson.annotations.SerializedName;

public class SpeciesModel {
    
    @SerializedName("name")
    private String name;

    @SerializedName("classification")
    private String classification;

    @SerializedName("designation")
    private String designation;

    @SerializedName("average_height")
    private String average_height;

    @SerializedName("skin_colors")
    private String skin_colors;

    @SerializedName("average_lifespan")
    private String average_lifespan;


    public SpeciesModel(String name, String classification, String designation, String average_height,
                     String skin_colors, String average_lifespan){

        this.name = name;
        this.classification = classification;
        this.designation = designation;
        this.average_height = average_height;
        this.skin_colors = skin_colors;
        this.average_lifespan = average_lifespan;
    }

    public String getName() { return name; }
    public String getClassification() { return classification; }
    public String getDesignation() { return designation; }
    public String getAverage_height() { return average_height; }
    public String getSkin_colors() { return skin_colors; }
    public String getAverage_lifespan()  { return average_lifespan; }
}