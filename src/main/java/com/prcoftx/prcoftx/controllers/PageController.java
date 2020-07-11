package com.prcoftx.prcoftx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/gallery")
    public String returnGalleryView() {




        return "gallery";
    }

    @GetMapping("/testimonial")
    public String returnTestimonialView(){

        return "testimonial";
    }



}
