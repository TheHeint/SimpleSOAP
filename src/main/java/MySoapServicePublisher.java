import javax.xml.ws.Endpoint;

public class MySoapServicePublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/MySoapService", new MySoapService());
    }
}
