package com.example.demo.FlatRecords;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.data.repository.ListPagingAndSortingRepository.*;

@Controller
public class Flatscontroller {
    @Autowired
    private FlatsRepository repo;
    @GetMapping("/flats")
    public ModelAndView flats() {
        List<Flats> flat= repo.findAll(Sort.by("id"));
        ModelAndView mav = new ModelAndView("flatlist");
        mav.addObject("product",flat);
        return mav;
    }
    
}
