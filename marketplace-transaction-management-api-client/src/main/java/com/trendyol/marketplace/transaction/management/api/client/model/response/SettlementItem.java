package com.trendyol.marketplace.transaction.management.api.client.model.response;

public class SettlementItem {
    private String orderNumber;
    private String settlementItemStatusName;
    private String transactionTypeName;
    private String operationDate;
    private Double price;
    private Double commission;
    private Double supplierRevenue;
    private String reconciliationDate;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getSettlementItemStatusName() {
        return settlementItemStatusName;
    }

    public void setSettlementItemStatusName(String settlementItemStatusName) {
        this.settlementItemStatusName = settlementItemStatusName;
    }

    public String getTransactionTypeName() {
        return transactionTypeName;
    }

    public void setTransactionTypeName(String transactionTypeName) {
        this.transactionTypeName = transactionTypeName;
    }

    public String getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Double getSupplierRevenue() {
        return supplierRevenue;
    }

    public void setSupplierRevenue(Double supplierRevenue) {
        this.supplierRevenue = supplierRevenue;
    }

    public String getReconciliationDate() {
        return reconciliationDate;
    }

    public void setReconciliationDate(String reconciliationDate) {
        this.reconciliationDate = reconciliationDate;
    }
}
