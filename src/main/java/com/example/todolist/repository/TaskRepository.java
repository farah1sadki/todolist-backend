package com.example.todolist.repository;
import com.example.todolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskRepository extends JpaRepository<Task,Long>
{
	
}

//TaskRepository fournit des méthodes pour effectuer des opérations CRUD sur task