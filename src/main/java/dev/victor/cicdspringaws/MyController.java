package dev.victor.cicdspringaws;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/test")
public class MyController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String test(){
        return "Hello World <br />" + new Date();
    }
}
