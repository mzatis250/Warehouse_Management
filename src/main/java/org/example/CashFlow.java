package org.example;

import java.io.ObjectStreamException;
import java.util.List;

public class CashFlow implements CashFlowObserver {
    private double budget;
    private double gross;
    private double balance;
    List<org.example.Observer>observerList;


    public CashFlow(double budget, double gross){
        this.budget=budget;
        this.gross=gross;
        balance=gross-budget;
    }



    @Override
    public void attach(org.example.Observer o) {this.observerList.add(o);}


    @Override
    public void detach(Observer o) {this.observerList.remove(o);}

    @Override
    public void notifyObservers() {
        for (org.example.Observer o: observerList)
            o.update();
    }

    @Override
    public String getState() {
        return null;
    }


}
