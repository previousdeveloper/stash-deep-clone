package com.trendyol.marketplace.transaction.management.api.client;

import com.trendyol.marketplace.transaction.management.api.client.model.SettlementFilterRequest;
import com.trendyol.marketplace.transaction.management.api.client.model.response.SettlementFilterResponse;
import com.trendyol.spring.boot.trendyol.client.starter.model.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TransactionManagementApiClient {
    private final RestTemplate restTemplate;
    private final TransactionManagementApiUrlService transactionManagementApiUrlService;

    @Autowired
    public TransactionManagementApiClient(RestTemplate restTemplate, TransactionManagementApiUrlService transactionManagementApiUrlService) {
        this.restTemplate = restTemplate;
        this.transactionManagementApiUrlService = transactionManagementApiUrlService;
    }

    public Pageable<SettlementFilterResponse> filter(SettlementFilterRequest settlementFilterRequest) {
        ParameterizedTypeReference<Pageable<SettlementFilterResponse>> responseType = new ParameterizedTypeReference<Pageable<SettlementFilterResponse>>() {
        };

        return restTemplate.exchange(transactionManagementApiUrlService.getFilterUrl(settlementFilterRequest), HttpMethod.GET, null, responseType).getBody();
    }

}
