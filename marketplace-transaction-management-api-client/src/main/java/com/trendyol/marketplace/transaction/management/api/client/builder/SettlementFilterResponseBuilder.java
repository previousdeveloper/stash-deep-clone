package com.trendyol.marketplace.transaction.management.api.client.builder;

import com.trendyol.marketplace.transaction.management.api.client.model.response.SettlementFilterResponse;
import com.trendyol.marketplace.transaction.management.api.client.model.response.SettlementItem;

import java.util.ArrayList;
import java.util.List;

public final class SettlementFilterResponseBuilder {
    private Double totalPrice;
    private Double totalSupplierRevenue;
    private Double totalCommission;
    private Integer totalLineCount;
    private List<SettlementItem> settlementItems = new ArrayList<>();

    private SettlementFilterResponseBuilder() {
    }

    public static SettlementFilterResponseBuilder aSettlementFilterResponse() {
        return new SettlementFilterResponseBuilder();
    }

    public SettlementFilterResponseBuilder totalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public SettlementFilterResponseBuilder totalSupplierRevenue(Double totalSupplierRevenue) {
        this.totalSupplierRevenue = totalSupplierRevenue;
        return this;
    }

    public SettlementFilterResponseBuilder totalCommission(Double totalCommission) {
        this.totalCommission = totalCommission;
        return this;
    }

    public SettlementFilterResponseBuilder totalLineCount(Integer totalLineCount) {
        this.totalLineCount = totalLineCount;
        return this;
    }

    public SettlementFilterResponseBuilder settlementItems(List<SettlementItem> settlementItems) {
        this.settlementItems = settlementItems;
        return this;
    }

    public SettlementFilterResponse build() {
        SettlementFilterResponse settlementFilterResponse = new SettlementFilterResponse();
        settlementFilterResponse.setTotalPrice(totalPrice);
        settlementFilterResponse.setTotalSupplierRevenue(totalSupplierRevenue);
        settlementFilterResponse.setTotalCommission(totalCommission);
        settlementFilterResponse.setTotalLineCount(totalLineCount);
        settlementFilterResponse.setSettlementItems(settlementItems);
        return settlementFilterResponse;
    }
}
