package kr.visioninside.vgen.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {

    @GetMapping("/prxUrl/hello")
    public String test(){
        return "Hello World";
    }

}
