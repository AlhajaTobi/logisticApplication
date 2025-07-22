package com.mycompany.logistic_management.services;

import com.mycompany.logistic_management.data.model.Inventory;
import com.mycompany.logistic_management.dto.OrderRequest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    @Test
    public void testThatUserCanCreateOrder(){
        OrderRequest request = new OrderRequest();
//        request.setReceiverAddress("ikeja");
//        request.setSenderAddress("Yaba");
//        request.setTotalItems(new ArrayList<>(
//                (Collection) new Inventory()
//        ));

    }

}