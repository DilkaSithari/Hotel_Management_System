package com.HotelManagementSystem.HotelManagementSystem.Controller;

import com.HotelManagementSystem.HotelManagementSystem.Entity.User;
import com.HotelManagementSystem.HotelManagementSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller

public class UserController {

@Autowired
    private UserRepository repo;

    @GetMapping("/")
    public String login(Model model){
    User user = new User();
    model.addAttribute("user",user);
        return  "login";
    }

//    @PostMapping("/userLogin")
//    public String loginUser (@ModelAttribute("user") User user){
//
//      String userName =  user.getUserName();
//      Optional<User> userdata = repo.findById(Long.valueOf(userName));
//
//     if(user.getPassword().equals(userdata.get().getPassword())){
//         return "hotels";
//     }
//     else{
//         return "error";
//     }
//
//    }
    @GetMapping("/home")
 public String home(){
        return "hotels";
 }


}
