package dian.pnp.ac.id.starwars;

import com.google.gson.annotations.SerializedName;

public class PlanetModel {
    @SerializedName("name")
    private String name;

    @SerializedName("rotation_period")
    private String rotation_period;

    @SerializedName("orbital_period")
    private String orbital_period;

    @SerializedName("diameter")
    private String diameter;

    @SerializedName("climate")
    private String climate;

    @SerializedName("gravity")
    private String gravity;


    public PlanetModel(String name, String rotation_period, String orbital_period, String diameter,
                     String climate, String gravity){

        this.name = name;
        this.rotation_period = rotation_period;
        this.orbital_period = orbital_period;
        this.diameter = diameter;
        this.climate = climate;
        this.gravity = gravity;
    }

    public String getName() { return name; }
    public String getRotation_period() { return rotation_period; }
    public String getOrbital_period() { return orbital_period; }
    public String getDiameter() { return diameter; }
    public String getClimate() { return climate; }
    public String getGravity()  { return gravity; }
}
