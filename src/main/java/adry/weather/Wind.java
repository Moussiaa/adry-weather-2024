package adry.weather;

import com.google.gson.annotations.SerializedName;

public class Wind {

    public double speed;
    @SerializedName("deg")
    public double degrees;
    public double gust;
}
