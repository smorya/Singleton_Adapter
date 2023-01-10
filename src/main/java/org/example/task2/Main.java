package org.example.task2;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        Client user = login.login("facebook","anastasiyapetrovych@gmail.com" , Client.Country.Ukraine);
        user.signup("nastia25");
        if (login.confirmation(user, "nastia25") == true){
            System.out.println(user.toString());
        };
        Client user2 = login.login("facebook", "petro@gmail.com", Client.Country.Poland);
        user2.signup("petro");
        if (login.confirmation(user2, "petro") == true){
            System.out.println(user2.toString());
        };
        MessageSender messageSender = new MessageSender();
        for(Client User: login.users.keySet()){
            messageSender.send("Happy new Year", User);

        }


    }
}
