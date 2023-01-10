package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor

public class FacebookUser implements Client{
    Login login;
    private String email;
    private Country userCountry;
    private LocalDate getUserActiveTime;

    public void signup(String password){
        login.users.put(this, password);
    }
    @Override
    public String toString(){
        return String.format("The user %s from %s was active at %s",email, userCountry, getUserActiveTime.toString());
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public Country getCountry() {
        return userCountry;
    }

    @Override
    public LocalDate getLastActiveTime() {
        return getUserActiveTime;
    }
}
