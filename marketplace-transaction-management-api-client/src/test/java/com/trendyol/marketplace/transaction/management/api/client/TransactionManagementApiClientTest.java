package com.trendyol.marketplace.transaction.management.api.client;

import com.trendyol.marketplace.transaction.management.api.client.TransactionManagementApiClient;
import com.trendyol.marketplace.transaction.management.api.client.TransactionManagementApiUrlService;
import com.trendyol.marketplace.transaction.management.api.client.builder.SettlementFilterRequestBuilder;
import com.trendyol.marketplace.transaction.management.api.client.builder.SettlementFilterResponseBuilder;
import com.trendyol.marketplace.transaction.management.api.client.model.SettlementFilterRequest;
import com.trendyol.marketplace.transaction.management.api.client.model.response.SettlementFilterResponse;
import com.trendyol.spring.boot.trendyol.client.starter.model.Pageable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TransactionManagementApiClientTest {

    @InjectMocks
    private TransactionManagementApiClient transactionManagementApiClient;

    @Mock
    private TransactionManagementApiUrlService transactionManagementApiUrl;

    @Mock
    private RestTemplate restTemplate;

    @Test
    public void it_should_filter() {
        //Given
        SettlementFilterRequest settlementFilterRequest = SettlementFilterRequestBuilder.aSettlementFilterRequest().build();

        Pageable pageable = new Pageable();
        pageable.setContent(Arrays.asList(SettlementFilterResponseBuilder.aSettlementFilterResponse().build()));
        ParameterizedTypeReference<Pageable<SettlementFilterResponse>> responseType = new ParameterizedTypeReference<Pageable<SettlementFilterResponse>>() {
        };
        when(transactionManagementApiUrl.getFilterUrl(settlementFilterRequest)).thenReturn("url");
        when(restTemplate.exchange("url", HttpMethod.GET, null, responseType)).thenReturn(new ResponseEntity<Pageable<SettlementFilterResponse>>(pageable, HttpStatus.OK));

        //When
        Pageable<SettlementFilterResponse> responsePageable = transactionManagementApiClient.filter(settlementFilterRequest);
        //Then
        assertThat(responsePageable.getContent()).hasSize(1);
    }
}