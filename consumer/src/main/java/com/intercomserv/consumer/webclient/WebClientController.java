package com.intercomserv.consumer.webclient;

import com.intercomserv.consumer.httpinterface.ProviderHttpInterface;
import com.intercomserv.consumer.restclient.ProviderRestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/http-interface")
public class WebClientController {

    private ProviderHttpInterface client;

    @GetMapping("/instance")
    public String getInstance() {
        return client.getInstanceInfo();
    }

}
