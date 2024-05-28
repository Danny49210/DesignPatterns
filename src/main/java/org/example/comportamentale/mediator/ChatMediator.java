package org.example.comportamentale.mediator;

public interface ChatMediator {
    public void sendMessage(String message, User user);
    public void addUser(User user);
}
