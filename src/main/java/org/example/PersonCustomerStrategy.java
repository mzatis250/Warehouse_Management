<<<<<<< HEAD
package org.example;

import java.util.Calendar;
import java.util.UUID;

public class PersonCustomerStrategy implements CustomerStrategy{
    String customerName;
    UUID customerId;
    int phoneNum;
    String address;
    int birthDate;
    int year = Calendar.getInstance().get(Calendar.YEAR);

    public PersonCustomerStrategy(String customerName, UUID customerId, int phoneNum, String address, int birthDate){
        this.customerName=customerName;
        this.customerId=customerId;
        this.phoneNum=phoneNum;
        this.address=address;
        this.birthDate=birthDate;
    }

    @Override
    public String pay(double allcosts, int amountofgoods) throws Exception {
        if(allcosts>250000){
            throw new Exception("Maximum costs of goods per order is 250000!");

        }
        else if( year - birthDate<18){
            throw new Exception("You must be at least 18");
        }
        else return "Final cost is "+allcosts+" number of ordered goods is "+amountofgoods;
    }
}
=======
package org.example;

import java.util.Calendar;
import java.util.UUID;

public class PersonCustomerStrategy implements CustomerStrategy{
    String customerName;
    UUID customerId;
    int phoneNum;
    String address;
    int birthDate;
    int year = Calendar.getInstance().get(Calendar.YEAR);

    public PersonCustomerStrategy(String customerName, UUID customerId, int phoneNum, String address, int birthDate){
        this.customerName=customerName;
        this.customerId=customerId;
        this.phoneNum=phoneNum;
        this.address=address;
        this.birthDate=birthDate;
    }

    @Override
    public String pay(double allcosts, int amountofgoods) throws Exception {
        if(allcosts>250000){
            throw new Exception("Maximum costs of goods per order is 250000!");

        }
        else if( year - birthDate<18){
            throw new Exception("You must be at least 18");
        }
        else return "Final cost is "+allcosts+" number of ordered goods is "+amountofgoods;
    }
}
>>>>>>> 331e81758f001274e09795594db7f79bec80e3e8
