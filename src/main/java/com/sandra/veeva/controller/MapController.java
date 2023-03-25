package com.sandra.veeva.controller;

import com.sandra.veeva.Location;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MapController {

    @Value("${tomtom.apikey}")
    private String tomTomApiKey;


    private List<Location> coolLocations() {
        return List.of(
                new Location(new double[]{-121.901481, 36.618253}, "Monterey Bay Aquarium"),
                new Location(new double[]{21.006010, 52.231606}, "Palace of Culture and Science"),
//                new Location(new double[]{2.337612, 48.860717}, "Louvre Museum");
                new Location(new double[]{2.337612, 48.860717}, "<html><body>hello everybody</br><a href='http://www.google.fr'  target=\"_blank\">Important announcement</a></body></html>")
        );
    }
    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("apikey", tomTomApiKey);
        model.addAttribute("coolLocations", coolLocations());

        return "home";
    }

}