package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
  @Autowired 
  private FinGoalRepo financialGoalRepository;

  @PostMapping(path="/demo")
  public String displayFinancialGoal (@ModelAttribute FinGoal goal, Model model) {
    Integer t = goal.getTime();
    Integer g = goal.getGoal();
    Double savePerMonth = (double)g/t;
    goal.setSaving(savePerMonth);
    System.out.println(savePerMonth);
    financialGoalRepository.save(goal);
    model.addAttribute("finGoal", goal);
    return "result";
  }

  @GetMapping(path="/demo")
  public String addNewFinancialGoal (Model model) {
    model.addAttribute("finGoal", new FinGoal());
    return "adduser";
  }

  // @GetMapping(path="/demo")
  // public @ResponseBody Iterable<User> getAllUsers() {
  //   return userRepository.findAll();
  // }
}