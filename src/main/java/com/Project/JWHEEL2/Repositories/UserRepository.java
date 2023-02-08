package com.Project.JWHEEL2.Repositories;
 
import org.springframework.data.repository.CrudRepository;

import com.Project.JWHEEL2.Models.User;
 
public interface UserRepository extends CrudRepository<User, Integer> {
    public User findByEmail(String email); 
}