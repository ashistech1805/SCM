package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
//   import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

@RequestMapping("/home")
 public String home(){
      System.out.println("Home page handler");
       return "home";
 }

 @RequestMapping("/base")
 public String baseString(){
      System.out.println("Base page handler");
       return "base";
 }

 @RequestMapping("/about")
 public String aboutPage(){
      System.out.println("Calling about ");
      return "about";
 }

 @RequestMapping("/services")
 public String servicePage(){
      System.out.println("Calling about ");
      return "services";
 }
 
 //contact page 
 @GetMapping("/contact")
 public String contact(){
     return new String("contact");
 }

 //login page 
 @GetMapping("/login")
 public String login(){
     return new String("login");
 }

 //register page 
 @GetMapping("/register")
 public String register(){
     return new String("register");
 }
}
