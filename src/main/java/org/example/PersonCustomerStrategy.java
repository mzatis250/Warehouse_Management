package org.example;

import java.util.UUID;

public class PersonCustomerStrategy implements CustomerStrategy{
    String customerName;
    UUID customerId;
    int phoneNum;
    String address;


    public PersonCustomerStrategy(String customerName, UUID customerId, int phoneNum, String address){
        this.customerName=customerName;
        this.customerId=customerId;
        this.phoneNum=phoneNum;
        this.address=address;
    }

    @Override
    public String pay(double allcosts, int amountofgoods) throws Exception {
        if(amountofgoods>10){
            throw new Exception("Maximum number of goods per order is 10!");

        }
        else return "Final cost is "+allcosts+" number of ordered goods is "+amountofgoods;
    }
}
