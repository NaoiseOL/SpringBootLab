package ie.atu.labone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class RequestController {
    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }
}
