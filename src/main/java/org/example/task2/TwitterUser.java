package org.example.task2;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
public class TwitterUser implements Client {
    Login login;
    private String userMail;
    private Country country;
    private LocalDate lastActiveTime;

    public void signup(String password){
        login.users.put(this, password);
    }

    @Override
    public String toString(){
        return String.format("The user %s from %s was active at %s", userMail, country, lastActiveTime.toString());
    }

    @Override
    public String getEmail() {
        return userMail;
    }

    @Override
    public Country getCountry() {
        return country;
    }

    @Override
    public LocalDate getLastActiveTime() {
        return lastActiveTime;
    }
}
