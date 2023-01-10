package org.example.task2;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        Client user = login.login("facebook","maryana@gmail.com" , Client.Country.Ukraine);
        user.signup("maryana");
        if (login.confirmation(user, "maryana") == true){
            System.out.println(user.toString());
        };
        Client user2 = login.login("facebook", "mariya@gmail.com", Client.Country.Poland);
        user2.signup("mariya");
        if (login.confirmation(user2, "mariya") == true){
            System.out.println(user2.toString());
        };
        MessageSender messageSender = new MessageSender();
        for(Client User: login.users.keySet()){
            messageSender.send("Happy new Year", User);

        }


    }
}
