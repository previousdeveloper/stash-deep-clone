package com.trendyol.marketplace.transaction.management.api.client;

import com.trendyol.marketplace.transaction.management.api.client.builder.SettlementFilterRequestBuilder;
import com.trendyol.marketplace.transaction.management.api.client.configuration.TransactionManagementApiClientProperty;
import com.trendyol.marketplace.transaction.management.api.client.model.SettlementFilterRequest;
import com.trendyol.spring.boot.trendyol.client.starter.utils.Clock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class TransactionManagementApiUrlServiceTest {

    @InjectMocks
    private TransactionManagementApiUrlService transactionManagementApiUrlService;

    @Mock
    private TransactionManagementApiClientProperty transactionManagementApiClientProperty;

    @Before
    public void init() {
        when(transactionManagementApiClientProperty.getUrl()).thenReturn("http://localhost:6161");
    }

    @Test
    public void it_should_get_filter_url() {
        //Given
        Clock.freeze();

        Long date = 1234L;

        SettlementFilterRequest settlementFilterRequest = SettlementFilterRequestBuilder.aSettlementFilterRequest()
                .size(50)
                .page(0)
                .supplierId(100L)
                .settlementItemStatusName("status")
                .orderStartDate(date)
                .orderEndDate(date)
                .periodEndDate(date)
                .periodStartDate(date).build();
        //When
        String url = transactionManagementApiUrlService.getFilterUrl(settlementFilterRequest);

        //Then
        assertThat(url).isEqualTo("http://localhost:6161/settlement?settlementItemStatusName=status&supplierId=100&page=0&size=50&orderStartDate=1234&orderEndDate=1234&periodStartDate=1234&periodEndDate=1234");
        Clock.unfreeze();
    }
}