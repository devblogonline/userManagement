package com.userManagement.User.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.userManagement.User.Model.*;
import com.userManagement.User.Services.*;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserDao  userDao;

    @RequestMapping(value = "userList", method = RequestMethod.GET)
    public String userOverview(Model model) {
        model.addAttribute("list", userRepository.findAll());
        return "userList";
    }

    @RequestMapping(value = "newUser", method = RequestMethod.GET)
    public String newUserView(Model model) {
        model.addAttribute("user", new User() );
        return "newUser";
    }

    @RequestMapping(value = "saveUser", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute User user){
        userDao.saveUser(user);
        return "redirect:/userList/";
    }
}
