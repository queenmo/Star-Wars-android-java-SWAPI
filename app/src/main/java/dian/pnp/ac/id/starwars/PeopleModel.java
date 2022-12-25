package dian.pnp.ac.id.starwars;

import com.google.gson.annotations.SerializedName;

public class PeopleModel {

    @SerializedName("name")
    private String name;

    @SerializedName("height")
    String height;

    @SerializedName("mass")
    private String mass;

    @SerializedName("skin_color")
    private String skin_color;

    @SerializedName("birth_year")
    private String birth_year;

    @SerializedName("gender")
    private String gender;


    public PeopleModel(String name, String height, String mass, String skin_color,
                     String birth_year, String gender){

        this.name = name;
        this.height = height;
        this.mass = mass;
        this.skin_color = skin_color;
        this.birth_year = birth_year;
        this.gender = gender;
    }

    public String getName() { return name; }
    public String getHeight() { return height; }
    public String getMass() { return mass; }
    public String getSkin_color() { return skin_color; }
    public String getBirth_year() { return birth_year; }
    public String getGender()  { return gender; }
}