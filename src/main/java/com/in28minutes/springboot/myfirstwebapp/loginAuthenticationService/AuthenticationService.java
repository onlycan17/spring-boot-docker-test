package com.in28minutes.springboot.myfirstwebapp.loginAuthenticationService;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        // in28minutes, dummy
        return username.equalsIgnoreCase("in28minutes")
                && password.equalsIgnoreCase("dummy");
    }
}