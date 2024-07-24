package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.springboot.myfirstwebapp.loginAuthenticationService.AuthenticationService;

@Controller
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/login")
    public String gotoLoginPage() {
        return "login";
    }

    @PostMapping("login")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            ModelMap model) {
        boolean isValidUser = authenticationService.authenticate(username, password);
        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
        model.put("name", username);
        // model.put("password", password);
        return "welcome";
    }
}
