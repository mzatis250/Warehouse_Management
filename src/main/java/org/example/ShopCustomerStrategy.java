<<<<<<< HEAD
package org.example;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class ShopCustomerStrategy implements CustomerStrategy{
    String shopId;
    int phoneNum;
    String address;
    String shopName;

    public ShopCustomerStrategy( int phoneNum, String address, String shopName){

        this.phoneNum=phoneNum;
        this.address=address;
        this.shopName=shopName;
        this.shopId="";
        for(int i=0; i<4; i++) {
            this.shopId=this.shopId.concat(String.valueOf(ThreadLocalRandom.current().nextInt(0, 9)));
        }
    }

    public String pay(double allcosts, int amountofgoods) throws Exception {
        if(allcosts>20000000){
            throw new Exception("Maximum costs of goods per order is 20000000!");

        }
        else return "Final cost is "+allcosts+" number of ordered goods is "+amountofgoods;
    }

}
=======
package org.example;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class ShopCustomerStrategy implements CustomerStrategy{
    String shopId;
    int phoneNum;
    String address;
    String shopName;

    public ShopCustomerStrategy( int phoneNum, String address, String shopName){

        this.phoneNum=phoneNum;
        this.address=address;
        this.shopName=shopName;
        this.shopId="";
        for(int i=0; i<4; i++) {
            this.shopId=this.shopId.concat(String.valueOf(ThreadLocalRandom.current().nextInt(0, 9)));
        }
    }

    public String pay(double allcosts, int amountofgoods) throws Exception {
        if(allcosts>20000000){
            throw new Exception("Maximum costs of goods per order is 20000000!");

        }
        else return "Final cost is "+allcosts+" number of ordered goods is "+amountofgoods;
    }

}
>>>>>>> 331e81758f001274e09795594db7f79bec80e3e8
