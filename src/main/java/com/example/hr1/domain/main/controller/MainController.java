package com.example.hr1.domain.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
 
    @GetMapping("/")
    // Mapping을 기반으로 함수를 실행 시키기 때문에
    // controller의 함수 이름은 중요하지 않다
    //
    public ModelAndView mainPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main/main"); 
        return modelAndView;
    
    }
}
