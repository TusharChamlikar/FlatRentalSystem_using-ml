package com.example.demo.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class PostController {
    @Autowired
    private PostRepository repo;

    @GetMapping("/postflat")
    public ModelAndView postflats() {
        ModelAndView mav = new ModelAndView("postflat");
        mav.addObject("product", new post());
        return mav;
    }
    @PostMapping("/postflat")
    public String postMethodName(@ModelAttribute post cred) {
         post newn = new post();
         newn.setFlatnumber(cred.getFlatnumber());
         newn.setAddress(cred.getAddress());
         newn.setSize(cred.getSize());
         newn.setNumberofrooms(cred.getNumberofrooms());
         newn.setAmenities(cred.getAmenities());
         newn.setRent(cred.getRent());
         newn.setSecuritydeposit(cred.getSecuritydeposit());
         newn.setStatus(cred.getStatus());
         repo.save(newn);
         return "redirect:/login";
    }
}
