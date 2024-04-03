package org.example;

public class ClientA {

    ServiceBClient serviceB = new ServiceBClient();
    // ServiceB serviceB = new ServiceB(); // Not accessible


    public String get() {

        return serviceB.get();
    }

}
