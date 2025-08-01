package com.celestial.loreorbit;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("loreorbit")
public class HelloController {

    @GetMapping("/page1")
    public Map<String, Object> hello() {
        Map<String, Object> data = new HashMap<>();
        data.put("year", "1 BBY");
        data.put("content", "An intergalactic trade war between the Ikargi and Sulkans has begun.");
        return data;
    }
}
