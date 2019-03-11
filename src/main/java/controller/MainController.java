package pl.akademiakodu.wheatherforecast;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.text.DecimalFormat;

@Controller
public class MainController {
    DecimalFormat df = new DecimalFormat("0.00");

    @ResponseBody //robi to samo co @RestController
    @GetMapping("/")
    public String index() {
        return "";
    }


    @GetMapping("/weathers/search")
    public String search(@RequestParam(required = false) String city, ModelMap modelMap) {
        if (city != null) {
            String url = "http://api.openweathermap.org/data/2.5/weather?q=Warszawa&appid=ef2028e98b54649bf1f4c4582631f350";
            RestTemplate restTemplate = new RestTemplate(); //Klasa ze Springa bierze nam Jsona i zamienia na Obkiet, tylko trzeba mu powiedzieć jak!
            WeatherModel weatherModel = restTemplate.getForObject(url, WeatherModel.class);
            modelMap.put("weather", df.format(weatherModel.getMain().getTemp()) + "℃");
        }
        return "search";
    }
}
