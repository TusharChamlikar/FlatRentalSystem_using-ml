package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.SIGNUP.Signup;


@Controller
public class aicontroller {
    @GetMapping("/ai")
    public ModelAndView redirectToLogin() {
    ModelAndView modelAndView = new ModelAndView("forai");
    modelAndView.addObject("value",new AI());
    return modelAndView;
}
@PostMapping("/ai")
public ModelAndView postMethodName(@ModelAttribute AI cred) {
    AI a = new AI();
    String c= cred.getAi();
    ModelAndView mav = new ModelAndView("redirect:http://localhost:8080/?m="+c);
    return mav;
}

}
