package com.web.controller;

import com.web.entity.User;
import com.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    public UserService userService;



    @GetMapping("/")
    public  String getAllUsers(Model model){
        model.addAttribute("users", userService.findAll());
        String usersList = "usersList";
        return usersList;
    }


    @GetMapping("/addUser")
    public String createUserPage(){
        return "createUser";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user")User user){
        userService.save(user);
        return "redirect:/";
    }
    @PostMapping("/updateUser")
    public String updateUser(@ModelAttribute("user")User user){
        userService.save(user);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String updateUser(@PathVariable("id") int id, Model model){
        model.addAttribute("user",userService.getById(id));
        return "editUser";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id){
        userService.delete(id);
        return "redirect:/";
    }
}
