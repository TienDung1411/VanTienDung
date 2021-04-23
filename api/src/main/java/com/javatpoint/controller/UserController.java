package com.javatpoint.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.javatpoint.model.User;  
import com.javatpoint.service.UserService;  

@RestController  
public class UserController   
{  

@Autowired  
UserService userService;  
@GetMapping("/us")  
private List<User> getAllBooks()   
{  
return userService.getAllBooks();  
}  

@GetMapping("/us/{id}")  
private User getBooks(@PathVariable(name = "id") int id)   
{  
return userService.getBooksById(id);  
}  

@DeleteMapping("/us/{id}")  
private void deleteBook(@PathVariable(name="id") int id)   
{  
	userService.delete(id);  
}  

@PostMapping("/us")  
private int saveBook(@RequestBody User us)   
{  
	userService.saveOrUpdate(us);  
return us.getStaff_id();  
}  
  
@PutMapping("/us")  
private User update(@RequestBody User us)   
{  
	userService.saveOrUpdate(us);  
return us;  
}  
}  
