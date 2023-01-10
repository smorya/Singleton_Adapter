package org.example.task2;

import java.time.LocalDate;
import java.util.HashMap;

public class Login {
    private static Client user;
    static HashMap<Client, String> users = new HashMap<>();

    public Client login(String method, String name, Client.Country country) {
        if (method == "twitter") {
            user = new TwitterUser(this, name, country, LocalDate.now());
            System.out.println("Welcome to Twitter");
        } else if (method == "facebook") {
            user = new FacebookUser(this, name, country, LocalDate.now());
            System.out.println("Welcome to Facebook");
        } else {
            System.out.println("There is no method to login");
        }
        return user;
    }

    public boolean confirmation(Client client, String password) {
        boolean isTrue = false;
        if (users.containsKey(client)) {
            if (users.get(client) == password) {
                System.out.println("Welcome" + " " + client.getEmail());
                isTrue = true;
            } else {
                System.out.println("The password is incorrect. Try again");
            }
        }
        return isTrue;
    }
}
