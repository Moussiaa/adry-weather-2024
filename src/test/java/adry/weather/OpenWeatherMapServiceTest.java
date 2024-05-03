package adry.weather;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpenWeatherMapServiceTest {

    @Test
    public void currentWeather() {
        // given
        ApiKey apiKey = new ApiKey();
        OpenWeatherMapService service = new OpenWeatherMapServiceFactory().getService();

        // when
        CurrentWeather currentWeather = service.currentWeather(
                // pass parameters
                apiKey.toString(),
                "Bulawayo",
                "standard" // avoid crashing test with a valid 0 result w C/Fº
        ).blockingGet();

        // then (ensure that the object returned from json is not 0)
        assertNotEquals(0, currentWeather.main.temperature);
        assertNotEquals(0, currentWeather.main.humidity);
        assertNotEquals(0, currentWeather.main.pressure);
        assertNotEquals(0, currentWeather.wind.gust);
        assertNotEquals(0, currentWeather.wind.speed);
    }

}