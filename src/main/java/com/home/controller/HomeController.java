package com.home.controller;

import com.home.data.UserDO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;

@Controller
public class HomeController {

    private UserDO userDO;
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

    @GetMapping("/secure/secure-home")
    public String secureHome(Model model){
        UserDO userDO = this.userDO;
        model.addAttribute("userDO", userDO);
        return "/secure/secureHome";
    }
}



