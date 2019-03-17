package com.americano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by gavinkim at 2019-03-17
 */
@Controller
public class IndexController {

    @GetMapping
    public String index(){
        return "index";
    }

}
