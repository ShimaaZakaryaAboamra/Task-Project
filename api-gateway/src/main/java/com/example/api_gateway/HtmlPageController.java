package com.example.api_gateway;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlPageController {

    @GetMapping("/add-user")
    public String addUserPage() {
        return "add-user";  // يرجع لملف add-user.html في templates
    }

    @GetMapping("/list-users")
    public String listUsersPage() {
        return "list-users"; // يرجع لملف list-users.html في templates
    }
}
