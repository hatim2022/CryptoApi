package crypto.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerBase {
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to spring boot ";
    }
}
