package org.example.jpacrud.domain.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("test")
    public String test(){
        return "test";
    }
}
