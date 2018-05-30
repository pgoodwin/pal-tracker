package tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeclomeController {
    @GetMapping("/")
    public String sayHello() {
        return "Slip me some skin bro";
    }
}
