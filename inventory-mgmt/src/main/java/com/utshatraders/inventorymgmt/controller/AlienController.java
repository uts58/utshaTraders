package com.utshatraders.inventorymgmt.controller;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AlienController {
    @GetMapping("/")
    public String home(){
        System.out.println(DigestUtils.sha512Hex("tarun"));
        return "Home";
    }
}
