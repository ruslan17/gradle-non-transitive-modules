package org.example;

public class ClientA {

    // We need DI to inject it
    ServiceBClient serviceBClient;
    // ServiceB serviceB = new ServiceB(); // Not accessible


    public String get() {

        return serviceBClient.get();
    }

}
