package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = Conexao.getConnection().connection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_usuarios");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nome1 = rs.getString("nome");
                String sobrenome1 = rs.getString("sobrenome");
                User user = new User(nome1,sobrenome1); 
                System.out.println(user);
            }
        } catch (SQLException ex) {
            System.out.println("ERRO" + ex.getMessage());
        }
    }
}