package rs.lovkonst.awsspringdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Aws";
    }

    @GetMapping("/user/{name}")
    public String userGreeting(@PathVariable String name) {
        return String.format("Nice to see you, %s!", name);
    }
}
