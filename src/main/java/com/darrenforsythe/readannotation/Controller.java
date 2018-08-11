package com.darrenforsythe.readannotation;


import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    @Secured("test")
    public String test() throws Exception {
        return this.getClass().getMethod("test").getAnnotation(Secured.class).value()[0];
    }
}
