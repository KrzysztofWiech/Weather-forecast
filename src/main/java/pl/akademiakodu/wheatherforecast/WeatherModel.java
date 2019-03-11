package pl.akademiakodu.wheatherforecast;

public class WheatherModel {

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
    }

}
