package com.prcoftx.prcoftx.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SplashController {




        @GetMapping("/home")
        public String welcome() {




            return "home";
        }


        @GetMapping("/home/{n}")
    public String test(@PathVariable Integer n){

        }
}
