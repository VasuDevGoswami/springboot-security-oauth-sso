package com.oauth2;

import java.security.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class SpringbootSecurityOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSecurityOauth2Application.class, args);
    }

    @GetMapping("/")
    public String getUserDetails(Principal principal) {
        return "Welcome : " + principal.getName();
    }
}


