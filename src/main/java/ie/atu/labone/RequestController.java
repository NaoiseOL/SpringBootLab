package ie.atu.labone;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class RequestController {
    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

    @GetMapping("/greet/{name}")
    public String getGreeting(@PathVariable String name){
        return "greetings " + name;
    }

    @GetMapping("/detail")
    public String getDetails(@RequestParam String name, @RequestParam int age){
        return "Name: " + name + " Age:" + age;
    }
}
