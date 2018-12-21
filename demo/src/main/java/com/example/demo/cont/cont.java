package com.example.demo.cont;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class cont {

    @ResponseBody
    @RequestMapping("helloworld")
    public String helloworld(){
        return "heoooollllllll what'up";



    }
}
