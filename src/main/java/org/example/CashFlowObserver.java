package org.example;

import java.util.Observer;

public interface CashFlowObserver {
    void attach(org.example.Observer o);
    void detach(org.example.Observer o);
    void notifyObservers();
    String getState();

}
