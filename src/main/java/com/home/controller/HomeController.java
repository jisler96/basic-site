package com.home.controller;

import com.home.data.UserDO;
import com.home.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HomeController {

    private UserDO userDO;
    private UserService userService;

    @Autowired
    public void UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String redirectToLogin(Model model){
        UserDO userDO = new UserDO();
        model.addAttribute("userDO", userDO);
        return "redirect:/login";
    }
    @GetMapping("/login")
    public String login(Model model) {
        UserDO userDO = new UserDO();
        model.addAttribute("userDO", userDO);
        return "/login";
    }

    @PostMapping("/login")
    public String submitLogin(@ModelAttribute("userDO") @Valid UserDO userDO, BindingResult result, Model model){
        this.userDO = userDO;
        return "redirect:/secure/secure-home";
    }

    @PostMapping(value = "/login", params = {"newUser"})
    public String newUserRegistration(@ModelAttribute("userDO") @Valid UserDO userDO, BindingResult result, Model model){
        this.userDO = userDO;
        return "redirect:/register";
    }

    @GetMapping("/secure/secure-home")
    public String secureHome(Model model){
        UserDO userDO = this.userDO;
        model.addAttribute("userDO", userDO);
        return "/secure/secureHome";
    }

    @GetMapping("/register")
    public String newUserRegistrationPage(Model model){
        UserDO userDO = new UserDO();
        model.addAttribute("userDO", userDO);
        return "/register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("userDO") @Valid UserDO userDO, BindingResult result, Model model) {
        userService.saveUser(userDO);

        return null;
    }
}



