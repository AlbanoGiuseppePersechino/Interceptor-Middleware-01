package co.develhope.Interceptor_Middleware_01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RequestMapping("/time")
@RestController
public class BasicController {

    @GetMapping("/")
    public String localDate(){
        return LocalDateTime.now().toString();
    }
}
