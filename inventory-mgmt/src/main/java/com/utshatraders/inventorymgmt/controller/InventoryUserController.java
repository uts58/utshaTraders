package com.utshatraders.inventorymgmt.controller;

import com.utshatraders.inventorymgmt.model.InventoryUser;
import com.utshatraders.inventorymgmt.repo.InventoryUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class InventoryUserController {

    @Autowired
    InventoryUserRepo inventoryUserRepo;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHome(Model model) {
        model.addAttribute("inventoryUser", new InventoryUser());
        return "Hometest";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postHome(@ModelAttribute InventoryUser inventoryUser) {
        inventoryUserRepo.save(inventoryUser);
        System.out.println(inventoryUser.toString());
        return "Hometest";
    }

}
