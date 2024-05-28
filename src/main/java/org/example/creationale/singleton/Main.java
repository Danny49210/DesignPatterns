package org.example.creationale.singleton;

import org.example.creationale.singleton.Servers;

public class Main {
    public static void main(String[] args) {
//        Servers server = new Servers();
        Servers server1 = Servers.getInstance();
        Servers server2 = Servers.getInstance();
//        System.out.println(server1);
//        System.out.println(server2);
        server1.addServer("http:/eu.com");
//        System.out.println(server1);
        server2.addServer("https:/yt.be");
//        System.out.println(server2);
        server2.downloadHttp();
        System.out.println(server2.downloadHttps());
    }
}
