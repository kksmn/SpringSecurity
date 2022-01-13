package com.example.demo6.controller;

import com.example.demo6.service.userService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@Controller
public class HelloServlet {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index() {

        return "index";
    }
    @RequestMapping(value="/admin", method=RequestMethod.GET)
    public String admin(HttpServletRequest request,HttpServletResponse response) {
        userService service=new userService();
        request.setAttribute("list",service.getUserInformation());
        return "admin";
    }
    @RequestMapping(value="/user", method=RequestMethod.GET)
    public String user(HttpServletRequest request,HttpServletResponse response) {
        userService service=new userService();
        request.setAttribute("list",service.getUserInformation());
        return "user";
    }
}