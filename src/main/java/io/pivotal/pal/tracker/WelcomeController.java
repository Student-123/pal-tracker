package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    Route: pal-tracker-grouchy-gorilla.cfapps.io
    cf push pal-tracker -p pal-tracker.jar --random-route
    993784f0c85466f12cf98dc65da8ff33cd0791df
    67d1ac38b7189010db15566d4bbae5b5c1d965c2
       JBP_CONFIG_OPEN_JDK_JRE: '{ jre: { version: 11.+ } }'
       GITHUB_OAUTH_TOKEN
       GITHUB_USERNAME
 */
@RestController
public class WelcomeController {

    private String message;

    public WelcomeController(@Value("${welcome.message}") String message){
        this.message = message;
    }

    @GetMapping("/")
    public String sayHello() {
        return message;
    }
}