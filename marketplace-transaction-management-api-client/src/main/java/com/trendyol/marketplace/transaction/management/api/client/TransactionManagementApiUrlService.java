package com.trendyol.marketplace.transaction.management.api.client;

import com.trendyol.marketplace.transaction.management.api.client.configuration.TransactionManagementApiClientProperty;
import com.trendyol.marketplace.transaction.management.api.client.model.SettlementFilterRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Objects;

@Component
public class TransactionManagementApiUrlService {

    private final TransactionManagementApiClientProperty transactionManagementApiClientProperty;

    public TransactionManagementApiUrlService(TransactionManagementApiClientProperty transactionManagementApiClientProperty) {
        this.transactionManagementApiClientProperty = transactionManagementApiClientProperty;
    }

    public String getFilterUrl(SettlementFilterRequest settlementFilterRequest) {
        UriComponentsBuilder path = getUriComponentsBuilder()
                .path("/settlement");

        if (Objects.nonNull(settlementFilterRequest.getSettlementItemStatusName())) {
            path.queryParam("settlementItemStatusName", settlementFilterRequest.getSettlementItemStatusName());
        }
        if (Objects.nonNull(settlementFilterRequest.getSupplierId())) {
            path.queryParam("supplierId", settlementFilterRequest.getSupplierId());
        }
        if (Objects.nonNull(settlementFilterRequest.getPage())) {
            path.queryParam("page", settlementFilterRequest.getPage());
        }
        if (Objects.nonNull(settlementFilterRequest.getSize())) {
            path.queryParam("size", settlementFilterRequest.getSize());
        }
        if (Objects.nonNull(settlementFilterRequest.getOrderStartDate()) && Objects.nonNull(settlementFilterRequest.getOrderEndDate())) {
            path.queryParam("orderStartDate", settlementFilterRequest.getOrderStartDate());
            path.queryParam("orderEndDate", settlementFilterRequest.getOrderEndDate());
        }
        if (Objects.nonNull(settlementFilterRequest.getPeriodStartDate()) && Objects.nonNull(settlementFilterRequest.getPeriodEndDate())) {
            path.queryParam("periodStartDate", settlementFilterRequest.getPeriodStartDate());
            path.queryParam("periodEndDate", settlementFilterRequest.getPeriodEndDate());
        }

        return path.build().toString();
    }

    private UriComponentsBuilder getUriComponentsBuilder() {
        return UriComponentsBuilder.fromHttpUrl(transactionManagementApiClientProperty.getUrl());
    }
}
