package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@RestController
@RequestMapping("/api")
public class PredictionController {

    @Autowired
    private PredictionService predictionService;
    
    @GetMapping("/predict")
    public ModelAndView getMethodName() {
    ModelAndView mav= new ModelAndView("newn");
    mav.addObject("cred",new Predict());
    return mav;
    }
    
    @PostMapping("/predict")
    public Double predictPrice(@ModelAttribute Predict c) {
        Predict d= new Predict();
        d.setHouse(c.getHouse());
        d.setHousesize(c.getHousesize());
        d.setLocation(c.getLocation());
        d.setCity(c.getCity());
        d.setAmenities(c.getAmenities());

        return predictionService.getPredictedPrice(d.getHouse(), d.getHousesize(), d.getLocation(), d.getCity(), d.getAmenities());
    }
}
