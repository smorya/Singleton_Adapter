package org.example.task1;
import lombok.Setter;
import lombok.SneakyThrows;
import  org.example.task1.DBConnection;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

import java.sql.SQLException;

@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String age;
    private String email;

    @SneakyThrows
    public void save(){
        DBConnection dbConnection = DBConnection.getInstance();
        dbConnection.parseQuery("INSERT INTO user VALUES ('" + name + "', '" + email + "', " + age + ")");
    }
}
