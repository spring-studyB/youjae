package com.example.myJwtOauth.global.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TmpController {

    @GetMapping("/mainPage")
    @ResponseBody
    public String tmp(){
        return "mainPage";
    }
}
