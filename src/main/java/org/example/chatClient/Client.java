package org.example.chatClient;

public class Client {
    private String serverHost;
    private int port;

    public Client(String serverHost, int port) {
        this.serverHost = serverHost;
        this.port = port;
    }

    public void connect() {
        System.out.println("client started!");
    }
}
