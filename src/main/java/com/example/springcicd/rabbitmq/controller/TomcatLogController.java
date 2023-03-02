package com.example.springcicd.rabbitmq.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class TomcatLogController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        log.info("name = {}", name);
        return "Hello " + name;
    }

    @GetMapping("/goodbye/{name}")
    public String sayGoodBye(@PathVariable String name) {
        log.info("name = {}", name);
        return "Good bye " + name;
    }
}
