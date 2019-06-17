package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    Route: pal-tracker-wacky-nyala.cfapps.io
    cf push pal-tracker -p pal-tracker.jar --random-route
 */
@RestController
public class WelcomeController {

    @GetMapping("/")
    public String sayHello() {
        return "hello";
    }
}