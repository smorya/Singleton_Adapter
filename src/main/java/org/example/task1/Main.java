package org.example.task1;

import lombok.SneakyThrows;

import java.sql.SQLException;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        User user = new User("Mariya", "36", "mariya@gmail.com");
        user.save();
        User user2 = new User("Maksym", "36", "maksym@gmail.com");
        user2.save();

    }
}
