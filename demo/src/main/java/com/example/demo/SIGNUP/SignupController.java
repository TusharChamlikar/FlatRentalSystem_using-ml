package com.example.demo.SIGNUP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Login;
import com.example.demo.LoginRepository;



@Controller
public class SignupController {
    @Autowired
    private SignupRepository repo;
    @Autowired
    private LoginRepository repo1;

    @GetMapping("/signup")
    public ModelAndView getMethodName() {
        ModelAndView mav = new ModelAndView("signup");
        mav.addObject("cred", new Signup());
        return mav;
    }
    @PostMapping("/signup")
    public String Sigup(@ModelAttribute Signup cred) {
        //TODO: process POST request
        Signup temp = new Signup();
        temp.setFirstname(cred.getFirstname());
        temp.setLastname(cred.getLastname());
        temp.setMobilenumber(cred.getMobilenumber());
        temp.setUsername(cred.getUsername());
        temp.setPassword(cred.getPassword());
        repo.save(temp);
        Login l = new Login();
        l.setUsername(cred.getUsername());
        l.setPassword(cred.getPassword());
       //TODO: process POST request
       
       
       repo1.save(l);
       return "redirect:/login";
    }
    
    
}
