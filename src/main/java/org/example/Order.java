package org.example;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Order {
    private UUID id;
    private UUID customerId;
    private int productId;
    private int amount;
    private Date orderPlaceDate;
    private Date expectedShippingDate;
    private Calendar c=Calendar.getInstance();

    public Order(UUID id, UUID customerId, int productId, int amount){
        this.id=id;
        this.customerId=customerId;
        this.productId=productId;
        this.amount=amount;
        c.setTime(orderPlaceDate);
        c.add(Calendar.DATE, 3);
        expectedShippingDate=c.getTime();
    }
}
