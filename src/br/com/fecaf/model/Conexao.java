package br.com.fecaf.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private String banco, password, server, user;

    public Connection conexao;

    public Conexao () {
        this.server = "localhost";
        this.banco = "db_java";
        this.user = "root";
        this.password = "Kr17@@05";
    }


    public boolean connectDrive () {
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" +
                    this.server + "/" + this.banco, this.user, this.password);

            return true;

        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }


    public Connection getConnection() {
        boolean validaConexao = connectDrive();
        System.out.println("O retorno da conexão com o banco é: " + validaConexao);

        return conexao;
    }



}
