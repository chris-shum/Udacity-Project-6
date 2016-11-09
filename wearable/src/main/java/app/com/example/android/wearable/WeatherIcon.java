package app.com.example.android.wearable;

/**
 * Created by ShowMe on 11/8/16.
 */

public class WeatherIcon {
    public static int loadWeatherIcon(int weatherId) {
        int icon = 0;

        if (weatherId >= 200 && weatherId <= 232) {
            icon = R.drawable.thunder;
        } else if (weatherId >= 300 && weatherId <= 321) {
            icon = R.drawable.drizzle;
        } else if (weatherId >= 500 && weatherId <= 504) {
            icon = R.drawable.raind;
        } else if (weatherId == 511) {
            icon = R.drawable.snow;
        } else if (weatherId >= 520 && weatherId <= 531) {
            icon = R.drawable.drizzle;
        } else if (weatherId >= 600 && weatherId <= 622) {
            icon = R.drawable.snow;
        } else if (weatherId >= 701 && weatherId <= 781) {
            icon = R.drawable.fog;
        } else if (weatherId == 800) {
            icon = R.drawable.clear;
        } else if (weatherId == 801) {
            icon = R.drawable.light_clouds;
        } else if (weatherId == 802) {
            icon = R.drawable.cloudy;
        }else if (weatherId >= 803 && weatherId <= 804) {
            icon = R.drawable.overcast;}
        return icon;
    }

}
