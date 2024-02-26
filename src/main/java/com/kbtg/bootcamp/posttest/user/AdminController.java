package com.kbtg.bootcamp.posttest.user;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @PostMapping ("/lotteries")
    public String createlottery (){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "hello";
    }

}
