package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    Route: pal-tracker-wacky-nyala.cfapps.io
    cf push pal-tracker -p pal-tracker.jar --random-route
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