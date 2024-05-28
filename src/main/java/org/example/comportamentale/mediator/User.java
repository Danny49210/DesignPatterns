package org.example.comportamentale.mediator;

public  abstract class User {
    protected String name;
    protected ChatMediator chat;

    public User(String name, ChatMediator chat) {
        this.name = name;
        this.chat = chat;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
