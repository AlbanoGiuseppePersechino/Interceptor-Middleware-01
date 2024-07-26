package co.develhope.Interceptor_Middleware_01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RequestMapping("/legacy")
@RestController
public class LegacyController {

    @GetMapping("/")
    public String LegacyDate(){
        return "This is just old code";
    }
}
