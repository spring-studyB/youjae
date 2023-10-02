package com.example.myJwtOauth.oauth.presentation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class OAuthController {
    @RequestMapping("/oauth2/sign-up")
    @ResponseBody
    public String signUP(){
        log.info("OAuthController.signUP");
        return "sign-up";
    }

}
