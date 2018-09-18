package com.saungkertas.backyard;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        return "Greetings";
    }

    @RequestMapping("/postjson")
    public String postjson(@RequestBody String postjson) {
        return postjson;
    }
}
