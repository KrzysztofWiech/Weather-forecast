package model;

import org.springframework.ui.ModelMap;
import org.springframework.web.client.RestTemplate;

import java.text.DecimalFormat;

public class WeatherModel {

    private WeatherDetails main;

    public WeatherDetails getMain() {
        return main;
    }

    public void setMain(WeatherDetails main) {
        this.main = main;
    }

    public static class WeatherDetails {
        private double temp;


        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public String getCalc() {
            DecimalFormat df = new DecimalFormat("0.00");

            return df.format(getTemp() - 273);
        }


    }

}
