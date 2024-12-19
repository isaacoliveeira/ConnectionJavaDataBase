package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class Conexao {


    private static Conexao instance;

    private static Connection conn;

    private Conexao() throws SQLException {
        conn = DriverManager.getConnection("jdbc:postgresql://ep-bitter-art-a40lxu3n-pooler.us-east-1.aws.neon.tech:5432/verceldb?sslmode=require", "default", "Q5Ic6OYwWHMr");
    }

    public static Conexao getConnection() throws SQLException{
        if (Objects.isNull(instance)) {
            instance = new Conexao();
        }
            return instance;
    }

    public Connection connection() {
        return conn;
    }
}
