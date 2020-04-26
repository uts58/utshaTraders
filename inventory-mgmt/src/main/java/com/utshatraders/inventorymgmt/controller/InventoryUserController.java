package com.utshatraders.inventorymgmt.controller;

import com.utshatraders.inventorymgmt.repo.InventoryUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InventoryUserController {

    @Autowired
    InventoryUserRepo inventoryUserRepo;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHome() {
        return "home";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postHome() {
        return "b";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin() {
        return "admin";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String user() {
        return "user";
    }

}
