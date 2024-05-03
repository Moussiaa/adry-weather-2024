package adry.weather;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * https://openweathermap.org/current
 */
public interface OpenWeatherMapService {

    @GET("/data/2.5/weather")
    Single<CurrentWeather> currentWeather(
            // pass parameters given on API (app id, city) to validate the call
            @Query("appid") String appId,
            @Query("q") String city,
            // let the API servers know which unit to retrieve instead of converting K
            @Query("units") String units
    );
}

//CurrentWeather is the object you get back from json.
// it has a temp, which