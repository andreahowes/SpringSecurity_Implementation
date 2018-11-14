package springbootsecuritydemo.securitydemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    String home(){
        return "/home";
    }

    @RequestMapping("/")
    String blankhome(){
        return "/home";
    }

    @RequestMapping("/login")
    String login(){
        return "/login";
    }

}
