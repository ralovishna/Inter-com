package com.intercomserv.consumer.httpinterface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface ProviderHttpInterface {
    @GetExchange("/instance")
    String getInstanceInfo();
}
