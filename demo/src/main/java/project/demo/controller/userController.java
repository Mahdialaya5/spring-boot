package project.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class userController {

    @GetMapping("/user")
      public String get(){
        return "list";
      }
}
