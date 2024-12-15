package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.FlatRecords.Flats;
import com.example.demo.FlatRecords.FlatsRepository;


@Controller
public class maincontroller {
    @Autowired
    private FlatsRepository repo;
    @GetMapping("/")
    public ModelAndView getMethodName() {
         List<Flats> flat= repo.findAll(Sort.by("id"));
        ModelAndView mav = new ModelAndView("main");
        mav.addObject("product",flat);
        return mav;
    }
    
}
