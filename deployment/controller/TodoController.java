package com.aws.deployment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aws.deployment.model.Todo;
import com.aws.deployment.repository.TodoRepository;

@RestController
public class TodoController {
	@Autowired
	TodoRepository todoRepo;
	
	//get all
	@GetMapping("/get-all")
	public List<Todo> getAll(){
		return todoRepo.findAll();
	}
	
	//add todo
	@PostMapping("/add-todo")
	public Todo addTodo(@RequestBody Todo newTodo) {
		return todoRepo.save(newTodo);
	}

}
