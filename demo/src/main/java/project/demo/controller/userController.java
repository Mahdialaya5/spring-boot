package project.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import project.demo.model.user;
import project.demo.repository.userRepository;



@Controller
public class userController {

  private userRepository repository;
  public userController(){
    repository= new userRepository();
  }
    @GetMapping("/user")
      public List<user> get(){
        return repository.findAll();
      }
}
