package com.example.demo;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
    @Autowired
    private LoginService service;

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView mav= new ModelAndView("login");
        mav.addObject("credentials",new Login());
        return mav;
    }
    @PostMapping("/login")
    public String loginsubmit(@ModelAttribute Login credentials) {
        
        Login user  = service.login(credentials.getUsername(),credentials.getPassword());
        if(Objects.nonNull(user)){
            return "main.html";
        }
        else{
            return "signup.html";
        }
    }
    
    
}
