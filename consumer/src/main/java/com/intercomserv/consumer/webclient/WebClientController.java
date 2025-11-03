package com.intercomserv.consumer.webclient;

import com.intercomserv.consumer.restclient.ProviderRestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/web-client")
public class WebClientController {

    private ProviderWebClient providerWebClient;

    @GetMapping("/instance")
    public Mono<String> getInstance() {
        return providerWebClient.getInstanceInfo();
    }

}
