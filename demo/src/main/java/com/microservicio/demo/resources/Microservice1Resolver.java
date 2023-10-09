package com.microservicio.demo.resources;

import org.springframework.stereotype.Component;

import com.microservicio.demo.microservice1.entities.Hola;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class Microservice1Resolver implements GraphQLQueryResolver {

    public Hola hello() {
        return new Hola("Saludos", "Hola Terricola");
    }
}