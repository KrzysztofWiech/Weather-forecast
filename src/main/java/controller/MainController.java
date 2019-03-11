package controller;


import model.CityModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import model.WeatherModel;

import java.text.DecimalFormat;

@Controller
public class MainController {
//    DecimalFormat df = new DecimalFormat("0.00");

    @ResponseBody //robi to samo co @RestController
    @GetMapping("/")
    public String index() {
        return "";
    }


    @GetMapping("/weathers/search")
    public String search(@RequestParam(required = false) String city, ModelMap modelMap) {
        CityModel cityModel = new CityModel();
        modelMap.put("weather", cityModel.cityModel(city));

        return "search";
    }
}
