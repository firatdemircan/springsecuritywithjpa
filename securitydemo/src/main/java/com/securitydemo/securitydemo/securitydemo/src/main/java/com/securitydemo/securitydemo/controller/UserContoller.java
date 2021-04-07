package com.securitydemo.securitydemo.controller;

import com.securitydemo.securitydemo.models.Product;
import com.securitydemo.securitydemo.models.UserAuth;
import com.securitydemo.securitydemo.services.UserAuthService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserContoller {

    private final UserAuthService userAuthService;



    public UserContoller(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }


    @PostMapping("/insert")
    public Map<String, UserAuth> insert(@RequestBody UserAuth userAuth){

        Map<String,UserAuth> hm = new HashMap<>();

        hm.put("Result",userAuthService.Save(userAuth));

        return hm;
    }

}
