package org.example.task3;

public class Database extends БазаДаних{
    public  String getUserInfo(){
        return super.отриматиДаніКористувача();
    }
    public String getUserStaticInfo(){
        return super.отриматиСтатистичніДані();
    }
}
