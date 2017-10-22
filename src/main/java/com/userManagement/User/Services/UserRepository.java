package com.userManagement.User.Services;

import com.userManagement.User.Model.*;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByNameAndAndLastName(String name, String lastName);
}