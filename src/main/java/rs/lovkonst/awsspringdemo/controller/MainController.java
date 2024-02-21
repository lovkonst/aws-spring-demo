package rs.lovkonst.awsspringdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import rs.lovkonst.awsspringdemo.entity.Endpoint;

import java.util.List;
import java.util.Random;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Aws<br> For more information go to '/help'";
    }

    @GetMapping("/help")
    public List<Endpoint> help() {
        return List.of(new Endpoint("/user/{name}", "Provide information for user"),
                new Endpoint("/am_i_lucky/{number}", "Try to guess the number from 1 to 5!"));
    }

    @GetMapping("/user/{name}")
    public String userGreeting(@PathVariable("name") String username) {
        return String.format("Nice to see you, %s!", username);
    }

    @GetMapping("/am_i_lucky/{number}")
    public String userGreeting(@PathVariable("number") Integer number) {
        Random random = new Random();
        var luckyNumber = random.nextInt(5);
        return luckyNumber == number ? "You are lucky!" : "You're a loser, try again";
    }
}
