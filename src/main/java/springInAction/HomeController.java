package springInAction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
This class is a controller that handles requests from the root path
It forwards these requests to the homepage view
*/

@Controller
public class HomeController{
    @GetMapping("/")
    public String home(){
        return "home";
    }
}