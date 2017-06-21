package com.example.ThymeleafSpringBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by odemirtas on 21.06.2017.
 */
@Controller
public class DenemeController {

    // inject via application.properties
    @Value("${deneme.message:test}")
    private String message = "Hello World";

    @RequestMapping("/deneme")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "deneme";
    }

}