package com.javatpoint.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.javatpoint.model.User;  
import com.javatpoint.repository.Repository;  
//defining the business logic  
@Service  
public class UserService   
{  
@Autowired  
Repository userRepository;  
//getting all books record by using the method findaAll() of CrudRepository  
public List<User> getAllBooks()   
{  
List<User> us = new ArrayList<User>();  
userRepository.findAll().forEach(us1 -> us.add(us1));  
return us;  
}  
//getting a specific record by using the method findById() of CrudRepository  
public User getBooksById(int id)   
{  
return userRepository.findById(id).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(User books)   
{  
userRepository.save(books);  
}  
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
userRepository.deleteById(id);  
}  
//updating a record  
public void update(User us, int id)   
{  
userRepository.save(us);  
}  
} 