package springbootsecuritydemo.securitydemo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    String hello(){
        return "/hello";
    }


}
