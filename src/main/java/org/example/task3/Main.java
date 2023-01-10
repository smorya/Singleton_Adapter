package org.example.task3;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authentication authentication = new Authentication();
        if (authentication.authenticate(db)) {
            ReportBuilder reportBuilder = new ReportBuilder(db);
        }
    }
}
