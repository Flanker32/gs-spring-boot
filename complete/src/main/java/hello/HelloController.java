package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/test")
    public String test() {
        String result = "";
        for (String name : System.getProperties().stringPropertyNames()) {
            result += name + " " + System.getProperty(name) + "\n";
        }
        return "Greetings from Spring Boot!" + result;
    }

}
