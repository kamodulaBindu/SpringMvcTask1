package com.stackroute.Controller;

import com.stackroute.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

    @RequestMapping("/")
    public String getName(Model model){
        User user = new User();
        user.setUserName("bindu");
        String s = user.getUserName();
        System.out.println(s);
        model.addAttribute("name",s);
        return "index";
    }
}
