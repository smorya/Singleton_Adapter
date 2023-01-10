package org.example.task2;

import java.time.Duration;
import java.time.LocalDate;

public class MessageSender {
    public void send(String text, Client user){
        if(user.getCountry() == Client.Country.Ukraine  && (Duration.between(LocalDate.now().atStartOfDay() , user.getLastActiveTime().atStartOfDay()).toSeconds() <= 360)){
            System.out.println(text + " " + "successfully send to" + " " + user.getEmail());
        }
        else {
            System.out.println("Oh, message wasn't sent to" + " " + user.getEmail());
        }
    }
}
