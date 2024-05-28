package org.example.comportamentale.observer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String channelName;
//    private HashMap<Subscriber, LocalDate> subscriberDate;

    public Channel(List<Subscriber> subscribers, String channelName) {
        this.subscribers = subscribers;
        this.channelName = channelName;
    }
    public Channel(String channelName) {
       // this.subscribers = new ArrayList<>();
        this.channelName = channelName;
    }

    public void registerSubscriber(Subscriber subscriber) {
        Subscriber subscriberCopy = new Subscriber(subscriber.getName());
        subscriberCopy.setSubTime(LocalDate.now());
        subscribers.add(subscriberCopy);
        System.out.println(subscriberCopy + " has been added.");
    }
    public void registerSubscriber(Subscriber subscriber, LocalDate time) {
        Subscriber subscriberCopy = new Subscriber(subscriber.getName());
        subscriberCopy.setSubTime(time);
        subscribers.add(subscriberCopy);
        System.out.println(subscriberCopy + " has been added.");
    }

    public void notify(String message) {
//        for (int i = 0; i < subscribers.size(); i++) {
//            subscribers.get(i).receiveMessage(message);
//        }
        for (Subscriber subscriber: subscribers) {
            subscriber.receiveMessage(message);
        }
    }
    public void notifyOldSub(String message, int time) {
//        for (int i = 0; i < subscribers.size(); i++) {
//            subscribers.get(i).receiveMessage(message);
//        }
            for (Subscriber subscriber : subscribers) {
                if (subscriber.getSubTime().getYear() < time) {
                    subscriber.receiveMessage(message);
                }

            }

    }

}
