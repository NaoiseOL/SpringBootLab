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

    @GetMapping("/calculate")
    public String getCalculation(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){
        switch(operation){
            case "add":
                return "operation: " + operation + " Ans: "  + (num1+num2);
            case "subtract":
                return "operation: " + operation + " Ans: " + (num1-num2);
            case "multiply":
                return "operation: " + operation + " Ans: "  + (num1*num2);
            case "divide":
                if(num2==0){
                    return "Unable to divide by 0";
                }else{
                    return "operation: " + operation + " Ans: "  + (num1/num2);}
            default:
                return "Incorrect input";
        }
    }
}
