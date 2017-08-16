package com.trendyol.marketplace.transaction.management.api.client.model.response;

import java.util.ArrayList;
import java.util.List;

public class SettlementFilterResponse {

    private Double totalPrice;
    private Double totalSupplierRevenue;
    private Double totalCommission;
    private Integer totalLineCount;
    private List<SettlementItem> settlementItems = new ArrayList<>();

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getTotalSupplierRevenue() {
        return totalSupplierRevenue;
    }

    public void setTotalSupplierRevenue(Double totalSupplierRevenue) {
        this.totalSupplierRevenue = totalSupplierRevenue;
    }

    public Double getTotalCommission() {
        return totalCommission;
    }

    public void setTotalCommission(Double totalCommission) {
        this.totalCommission = totalCommission;
    }

    public Integer getTotalLineCount() {
        return totalLineCount;
    }

    public void setTotalLineCount(Integer totalLineCount) {
        this.totalLineCount = totalLineCount;
    }

    public List<SettlementItem> getSettlementItems() {
        return settlementItems;
    }

    public void setSettlementItems(List<SettlementItem> settlementItems) {
        this.settlementItems = settlementItems;
    }
}
