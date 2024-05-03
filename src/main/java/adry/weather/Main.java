package adry.weather;

import com.google.gson.annotations.SerializedName;

public class Main {

    // alter designated names on API with
    @SerializedName("temp")
    public double temperature;
    public double humidity;
    public double pressure;
}
