package com.intercomserv.consumer.httpinterface;

import com.intercomserv.consumer.webclient.ProviderWebClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


import com.intercomserv.consumer.restclient.ProviderRestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import reactor.core.publisher.Mono;

    @RestController
    @RequestMapping("api/web-client")
    @RequiredArgsConstructor
public class HttpInterfaceController {

        private ProviderHttpInterface providerHttpInterface;

        @GetMapping("/instance")
        public String getInstance() {
            return providerHttpInterface.getInstanceInfo();
        }

    }

