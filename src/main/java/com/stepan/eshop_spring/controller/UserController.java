package com.stepan.eshop_spring.controller;


import com.stepan.eshop_spring.dto.UserDTO;
import com.stepan.eshop_spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new UserDTO());
        return "user";
    }

    @PostMapping("/new")
    public String save(UserDTO userDTO, Model model) {
        if(userService.save(userDTO)){
            return "redirect:/";
        } else {
            model.addAttribute("user", userDTO);
        }
        return "user";
    }




}
