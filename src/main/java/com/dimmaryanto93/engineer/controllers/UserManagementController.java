package com.dimmaryanto93.engineer.controllers;

import com.dimmaryanto93.engineer.entities.UserManagement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.UUID;

/**
 * Created by dimmaryanto93 on 06/03/17.
 */
@Controller
@RequestMapping("/user/management")
public class UserManagementController {
    private Logger console = LoggerFactory.getLogger(UserManagementController.class);

    @GetMapping("/register")
    public String getUserManagement(Model model) {
        UserManagement user = new UserManagement();
        user.setUsername("dimMaryanto93");
        user.setPassword(UUID.randomUUID().toString());
        user.setRole("ROLE_ADMIN");
        model.addAttribute("usermanagement", user);
        model.addAttribute("listRole", Arrays.asList("ROLE_ADMIN", "ROLE_OPERATOR", "ROLE_USER"));
        return "/usermanagement/register";
    }

    @PostMapping("/register")
    public String postingUser(@ModelAttribute UserManagement user) {
        console.info("informasi user {} : {} : {}", user.getUsername(), user.getPassword(), user.getRole());
        return "redirect:/user/management/register";
    }
}
