package com.senai.backend.rental_db.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
info = @Info(
title = "rental-db",
version = "1.0",
description = "API para o projeto rental_db"
)
)
public class Swagger {
    
}
