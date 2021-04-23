package com.javatpoint.repository;  
import org.springframework.data.repository.CrudRepository;  
import com.javatpoint.model.User;  
//repository that extends CrudRepository  
public interface Repository extends CrudRepository<User, Integer>  
{  
}  