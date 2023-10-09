package com.microservicio.demo.microservice2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.demo.microservice2.entities.Bankai;

@RestController
public class Microservice2Controller {

    @RequestMapping("/bankai")
    public Bankai bankai() {
        return new Bankai("Activando", "Modo Bankai");
    }
}
