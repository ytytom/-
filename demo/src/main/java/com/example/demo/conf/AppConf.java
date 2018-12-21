package com.example.demo.conf;


import org.springframework.context.annotation.Configuration;
import com.example.demo.service.Service ;

@Configuration
public class AppConf {

    public Service studentService(){
        Service stuservie = new Service() ;
        return stuservie ;
    }

}
