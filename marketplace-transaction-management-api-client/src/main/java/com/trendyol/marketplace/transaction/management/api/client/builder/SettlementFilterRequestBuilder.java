package com.trendyol.marketplace.transaction.management.api.client.builder;

import com.trendyol.marketplace.transaction.management.api.client.model.SettlementFilterRequest;

import java.util.Date;

public final class SettlementFilterRequestBuilder {
    private Long supplierId;
    private String settlementItemStatusName;
    private Long periodStartDate;
    private Long periodEndDate;
    private Long orderStartDate;
    private Long orderEndDate;
    private Integer page = 0;
    private Integer size = 50;

    private SettlementFilterRequestBuilder() {
    }

    public static SettlementFilterRequestBuilder aSettlementFilterRequest() {
        return new SettlementFilterRequestBuilder();
    }

    public SettlementFilterRequestBuilder supplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public SettlementFilterRequestBuilder settlementItemStatusName(String settlementItemStatusName) {
        this.settlementItemStatusName = settlementItemStatusName;
        return this;
    }

    public SettlementFilterRequestBuilder periodStartDate(Long periodStartDate) {
        this.periodStartDate = periodStartDate;
        return this;
    }

    public SettlementFilterRequestBuilder periodEndDate(Long periodEndDate) {
        this.periodEndDate = periodEndDate;
        return this;
    }

    public SettlementFilterRequestBuilder orderStartDate(Long orderStartDate) {
        this.orderStartDate = orderStartDate;
        return this;
    }

    public SettlementFilterRequestBuilder orderEndDate(Long orderEndDate) {
        this.orderEndDate = orderEndDate;
        return this;
    }

    public SettlementFilterRequestBuilder page(Integer page) {
        this.page = page;
        return this;
    }

    public SettlementFilterRequestBuilder size(Integer size) {
        this.size = size;
        return this;
    }

    public SettlementFilterRequest build() {
        SettlementFilterRequest settlementFilterRequest = new SettlementFilterRequest();
        settlementFilterRequest.setSupplierId(supplierId);
        settlementFilterRequest.setSettlementItemStatusName(settlementItemStatusName);
        settlementFilterRequest.setPeriodStartDate(periodStartDate);
        settlementFilterRequest.setPeriodEndDate(periodEndDate);
        settlementFilterRequest.setOrderStartDate(orderStartDate);
        settlementFilterRequest.setOrderEndDate(orderEndDate);
        settlementFilterRequest.setPage(page);
        settlementFilterRequest.setSize(size);
        return settlementFilterRequest;
    }
}
