/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mikex.hello;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author MikeX
 */
@Controller
@RequestMapping(value = "hello")    
public class HelloController {
    
    @RequestMapping(value = "")    
    public @ResponseBody ModelAndView test01(HttpServletRequest request) {
               
        return new ModelAndView("/HelloJsp/hello.jsp");
    }
    
   
}
