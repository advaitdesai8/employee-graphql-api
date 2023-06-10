package com.advait.graphqlapi.controller;

import lombok.extern.slf4j.XSlf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/emp-api")
@XSlf4j
public class EmpController {

    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("hello");
    }
}
