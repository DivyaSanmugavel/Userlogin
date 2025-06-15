package com.example.login.Contrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginContrl {

    @GetMapping("user")
    public String accss()
    {
        return "Login";
    }
        @PostMapping("/connected")
        @ResponseBody
        public String loginSuccess() {
            return "<html><body style='text-align:center; margin-top:200px; color:green;'>"
                    + "LOGGED IN SUCCESSFULLY!"
                    + "</body></html>";
        }

    }
