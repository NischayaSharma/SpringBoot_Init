package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class MainController {
  @Autowired 
  private UserRepo userRepository;

  @PostMapping(path="/add")
  public String addNewUser (@ModelAttribute User user, Model model) {
    userRepository.save(user);
    model.addAttribute("user", user);
    return "result";
  }

  @GetMapping(path="/add")
  public String addUserForm(Model model) {
    model.addAttribute("user", new User());
    return "adduser";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    return userRepository.findAll();
  }
}