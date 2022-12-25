package dian.pnp.ac.id.starwars;

import com.google.gson.annotations.SerializedName;

public class VehicleModel {


    @SerializedName("name")
    private String name;

    @SerializedName("model")
    private String model;

    @SerializedName("manufacturer")
    private String manufacturer;

    @SerializedName("max_atmosphering_speed")
    private String max_atmosphering_speed;

    @SerializedName("crew")
    private String crew;

    @SerializedName("passengers")
    private String passengers;


    public VehicleModel(String name, String model, String manufacturer, String max_atmosphering_speed,
                          String crew, String passengers){

        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.max_atmosphering_speed = max_atmosphering_speed;
        this.crew = crew;
        this.passengers = passengers;
    }

    public String getName() { return name; }
    public String getModel() { return model; }
    public String getManufacturer() { return manufacturer; }
    public String getMax_atmosphering_speed() { return max_atmosphering_speed; }
    public String getCrew() { return crew; }
    public String getPassengers()  { return passengers; }

}