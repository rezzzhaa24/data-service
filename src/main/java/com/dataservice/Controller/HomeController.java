package com.dataservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dataservice.Service.ProductService;


@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String welcome (Model model){

        String messages = "DATA SERVICE";
        model.addAttribute("msg",messages);
        return "index";
     }
}
