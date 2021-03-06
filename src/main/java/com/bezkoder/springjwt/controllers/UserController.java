package com.bezkoder.springjwt.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping("/login")
    public String login(@RequestParam(name = "fail",
            required = false,
            defaultValue = "false") String errorFlag) {
        return "users/login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "users/signup";
    }
}
