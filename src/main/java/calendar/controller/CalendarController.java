package calendar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalendarController {
    @GetMapping
    public String getHello(){
        return "Hello word";
    }
}
