package org.example.observer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Subscriber sub1 = new Subscriber("Robert");
        Channel channel1 = new Channel("Canalul 1");
        channel1.registerSubscriber(sub1);
          Subscriber sub2 = new Subscriber("Maria");
//        channel1.registerSubscriber(sub2);
//        channel1.notify("haide in parc");
//        System.out.println(sub1.getSubTime());
//        sub2.setSubTime(LocalDate.of(2001,12,20));
//        channel1.notifyOldSub("bine ai venit ", 2000);
        Channel channel2 = new Channel("Canal 2");
        ChannelHashMap channel2Hashmap = new ChannelHashMap("Canal 2 Hashmap");
//        channel2.registerSubscriber(sub1);
        channel2Hashmap.registerSubscriberDate(sub1,LocalDate.of(2022,11,10));
        ChannelHashMap channelHashMap3 = new ChannelHashMap("Canal 3");
        channelHashMap3.registerSubscriberDate(sub1, LocalDate.of(2019, 11, 02));

        channel2Hashmap.notifyOldSubHashMap("hai la fotbal", 2020);
        channelHashMap3.notifyOldSubHashMap("hai la fotbal", 2020);

        channel2.registerSubscriber(sub1, LocalDate.of(1999,10,10));
        channel2.notifyOldSub("hai la tenis", 2000);

        channel1.notifyOldSub("orice vreau eu", 2000);
    }
}
