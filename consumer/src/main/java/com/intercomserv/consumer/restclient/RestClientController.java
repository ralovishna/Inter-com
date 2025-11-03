package com.intercomserv.consumer.restclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("api/rest-client")
public class RestClientController {

    private ProviderRestClient providerRestClient;

    @GetMapping("/instance")
    public String getInstance() {
        return providerRestClient.getInstanceInfo();
    }
}
