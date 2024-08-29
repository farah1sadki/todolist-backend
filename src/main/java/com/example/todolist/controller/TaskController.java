package com.example.todolist.controller;
import com.example.todolist.model.Task;
import com.example.todolist.service.TaskService;
import com.example.todolist.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import java.util.List;
@RestController
@RequestMapping("/tasks")
public class TaskController
{

	 @Autowired
     private TaskService taskservice ;
	
	 @GetMapping
	 public List <Task> getalltasks()
	 {
		 return taskservice.getAllTasks();
	 }
   	
	@GetMapping("/{id}")
	public Task getidtask(@PathVariable Long id)
	{
		
		return taskservice.getTaskById(id);
		
		
	}
	
	
	@PostMapping
	public Task createtask(@RequestBody Task task ) 
	{
		
		return taskservice.saveTask(task);
		
	}
	
	
	@PutMapping ("/{id}")
	public Task update(@PathVariable Long id ,@RequestBody Task task)
	{
		task.setid(id);
		return taskservice.saveTask(task);

	}
	@DeleteMapping("/{id}")
	public void deletetask(@PathVariable Long id) 
	{
		taskservice.deleteTask(id);
		
	 	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
