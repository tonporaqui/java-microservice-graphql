package com.microservicio.demo.resources;

import org.springframework.stereotype.Component;

import com.microservicio.demo.microservice2.entities.Bankai;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class Microservice2Resolver implements GraphQLQueryResolver {

    public Bankai bankai() {
        return new Bankai("Activación", "BANKAI");
    }
}
