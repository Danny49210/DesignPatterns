package org.example.mediator;

public class UserImpl extends User{
    public UserImpl(String name, ChatMediator chat) {
        super(name, chat);
    }

    @Override
    public void send(String message) {
//        System.out.println(this.name + " the message is: " + message);
        System.out.println("You to everyone: " + message);
        chat.sendMessage(message, this);

    }

    @Override
    public void receive(String message) {
        System.out.print("[" + this.name + "] ");
    }
}
