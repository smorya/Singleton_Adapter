package org.example.task3;

public class ReportBuilder {
    private Database db;
    public ReportBuilder(Database db) {
        this.db = db;
        System.out.println(db.getUserInfo());
    }
}
