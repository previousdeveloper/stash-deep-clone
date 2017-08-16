package com.trendyol.marketplace.transaction.management.api.client.model;

public class SettlementFilterRequest {
    private Long supplierId;
    private String settlementItemStatusName;
    private Long periodStartDate;
    private Long periodEndDate;
    private Long orderStartDate;
    private Long orderEndDate;
    private Integer page = 0;
    private Integer size = 50;

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSettlementItemStatusName() {
        return settlementItemStatusName;
    }

    public void setSettlementItemStatusName(String settlementItemStatusName) {
        this.settlementItemStatusName = settlementItemStatusName;
    }

    public Long getPeriodStartDate() {
        return periodStartDate;
    }

    public void setPeriodStartDate(Long periodStartDate) {
        this.periodStartDate = periodStartDate;
    }

    public Long getPeriodEndDate() {
        return periodEndDate;
    }

    public void setPeriodEndDate(Long periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    public Long getOrderStartDate() {
        return orderStartDate;
    }

    public void setOrderStartDate(Long orderStartDate) {
        this.orderStartDate = orderStartDate;
    }

    public Long getOrderEndDate() {
        return orderEndDate;
    }

    public void setOrderEndDate(Long orderEndDate) {
        this.orderEndDate = orderEndDate;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}

