package com.mycompany.logistic_management.dto;

import com.mycompany.logistic_management.data.model.Inventory;

import java.util.List;

public class OrderRequest {
    private String senderAddress;
    private String receiverAddress;
    private List <Inventory> totalItems;



    public String getSenderAddress() {
        return senderAddress;
    }

    public List<Inventory> getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(List<Inventory> totalItems) {
        this.totalItems = totalItems;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }


}
