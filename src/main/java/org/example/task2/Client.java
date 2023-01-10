package org.example.task2;

import java.time.LocalDate;
public interface Client {
    String getEmail();

    Country getCountry();

    LocalDate getLastActiveTime();

    void signup(String nastia25);

    enum Country {
        Ukraine, USA, Poland;
    }
}
