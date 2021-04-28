package com.example.Prova.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public ConnectionFactory() {
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/cinema", "root", "");
        } catch (SQLException var2) {
            throw new RuntimeException(var2);
        }
    }
}
