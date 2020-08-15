package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.FinGoal;

public interface FinGoalRepo extends CrudRepository<FinGoal, Integer> {

}