package model;

import org.springframework.ui.ModelMap;
import org.springframework.web.client.RestTemplate;

import java.text.DecimalFormat;

public class WeatherModel {

    private WheatherDetails main;

    public WheatherDetails getMain() {
        return main;
    }

    public void setMain(WheatherDetails main) {
        this.main = main;
    }

    public static class WheatherDetails {
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
