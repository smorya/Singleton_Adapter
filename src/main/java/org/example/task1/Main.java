package org.example.task1;

import lombok.SneakyThrows;

import java.sql.SQLException;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        User user = new User("Nastia", "18", "anastasiyapetrovych@gmail.com");
        user.save();
        User user2 = new User("Olia", "12", "olia@gmail.com");
        user2.save();

    }
}
