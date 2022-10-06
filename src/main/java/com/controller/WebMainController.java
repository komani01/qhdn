package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebMainController {

     @RequestMapping("/home")
     public String main(Model model){
          model.addAttribute(null, model);
          return "web/index";
     }
}
