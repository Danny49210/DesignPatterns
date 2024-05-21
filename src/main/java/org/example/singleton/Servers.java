package org.example.singleton;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Servers {
    private List<String> serverList = new ArrayList<>();
    private static Servers instance;
//            = new Servers();

    private Servers() {}
    public static Servers getInstance() {
        if (instance == null){
        instance = new Servers();
        }
        return instance;
    }

    public boolean addServer(String server) {
        if ((server.startsWith("http") || server.startsWith("https")) && !serverList.contains(server)) {
            serverList.add(server);
            System.out.println("Serverul a fost adaugat: " + server);
            return true;
        }
        System.out.println("Serverul nu corespunde formatului");
        return false;
    }

    public void downloadHttp() {
        System.out.println("Metoda de descarcare: http");
//        for (int i = 0; i < serverList.size(); i++) {
//            if (serverList.get(i).startsWith("http") && !serverList.get(i).startsWith("https")) {
//                System.out.println(serverList.get(i));
//            }
//        }
        for (String link : serverList) {
            if (link.startsWith("http:")) {
                System.out.println(link);
            }
        }
    }

    public List<String> downloadHttps() {
        return serverList.stream().filter(orice -> orice.startsWith("https")).collect(Collectors.toList());
        // http:/eu.com -> false = no output
        // https:/yt.be -> true = output obj orice
    }

    @Override
    public String toString() {
        return "Servers{" +
                "serverList=" + serverList +
                '}';
    }
    //    public Servers(List<String> serverList) {
//        this.serverList = serverList;
//    }
}