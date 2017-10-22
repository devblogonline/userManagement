package com.userManagement.User.Services;

import com.userManagement.User.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDao {

    @Autowired
    private UserRepository userRepository;

    public Boolean saveUser(User user){
        if(validateUserName(user).equals(Boolean.TRUE)){
            userRepository.save(user);
            return true;
        }
        return false;
    }

    private Boolean validateUserName(User user){
        if(userRepository.findByNameAndAndLastName(user.getName(), user.getLastName())==null)
            return true;
        else
            return false;
    }
}


