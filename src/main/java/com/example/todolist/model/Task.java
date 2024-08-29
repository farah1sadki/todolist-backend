package com.example.todolist.model;
import jakarta.persistence.*;

 
@Entity
public class Task
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String description ;
	private String title;
	
	
	public Long getid() 
	{
		
		return id;
	}
	
	
	
	public void setid(Long id) 
	{
		this.id=id;
		
	}
	
	
	public void settitle(String title)
	{
       this.title=title;		
		
	}	
	
	public String gettitle() 
	{
		return title;
		
		
	} 
	
	public void setdesc(String descripetion) 
	{
		
		this.description=description ;
		
		
	}
	
	public String getdesc() {
		
		return description ;
		
		
	}
	

}
