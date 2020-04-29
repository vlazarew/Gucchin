package com.example.Gucchin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GucchinApplication {

    public static void main(String[] args) {
        SpringApplication.run(GucchinApplication.class, args);
    }

}

@RestController
class HelloController {

    @GetMapping("/hello")
    
    public String Hello() {
        return "Проверка связи";
    }
}