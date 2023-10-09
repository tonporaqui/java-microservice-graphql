package com.microservicio.demo.microservice1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.demo.microservice1.entities.Hola;

@RestController
public class Microservice1Controller {

    @RequestMapping("/hello")
    public Hola hello() {
        return new Hola("Saludos", "Terricola");
    }

}
