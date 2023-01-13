package com.midhin.studentsreportingsysytem.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    @RequestMapping(value = "/hello")
    public String sayhello() {

        return "hello world";
    }
}
