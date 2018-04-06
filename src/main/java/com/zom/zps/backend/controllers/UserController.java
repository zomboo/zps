package com.zom.zps.backend.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/admin/user")
    public String index() {
        return "admin/user/index";
    }
}
