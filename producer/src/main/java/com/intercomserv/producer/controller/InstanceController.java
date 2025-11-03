package com.intercomserv.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstanceController {

    private final String instanceID = java.util.UUID.randomUUID().toString();
    @Value("${server.port}")
    private String port;

    @GetMapping("/instance-info")
    public String getInstanceInfo() {
        System.out.println("Request received at instance running on port: " + port);
        return "Instance served by Port: " + port + ". Instance ID: " + instanceID;
    }
}
