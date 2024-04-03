package org.example;

public class ServiceBClient {

    ServiceB serviceB = new ServiceB();

    public String get() {
        return serviceB.get();
    }

}
