package rs.lovkonst.awsspringdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import rs.lovkonst.awsspringdemo.entity.Endpoint;

import java.util.List;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Aws<br> For more information go to '/help'";
    }

    @GetMapping("/help")
    public List<Endpoint> help() {
        return List.of(new Endpoint("/user/{name}", "Provide information for user"));
    }

    @GetMapping("/user/{name}")
    public String userGreeting(@PathVariable("name") String username) {
        return String.format("Nice to see you, %s!", username);
    }
}
