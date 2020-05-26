package org.example;

import java.util.UUID;

public class ShopCustomerStrategy implements CustomerStrategy{
    UUID shopId;
    int phoneNum;
    String address;

    public ShopCustomerStrategy(UUID shopId, int phoneNum, String address){
        this.shopId=shopId;
        this.phoneNum=phoneNum;
        this.address=address;
    }

    @Override
    public String pay(double allcosts, int amountofgoods) {
        return "Final cost is "+allcosts+" number of ordered goods is "+amountofgoods;
    }


}
