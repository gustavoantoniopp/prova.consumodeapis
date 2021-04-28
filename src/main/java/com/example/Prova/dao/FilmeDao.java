
package com.example.Prova.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.Prova.factory.ConnectionFactory;
import com.example.Prova.model.Filme;


public class FilmeDao {

    private Connection connection = (new ConnectionFactory()).getConnection();

    public FilmeDao() {
    }

    public void newFilme() {
        String servidor = "create table if not exists Filme " +
                "(sala INTEGER PRIMARY KEY auto_increment, titulo VARCHAR(255), genero VARCHAR(255)," +
                "duração time, linguagem VARCHAR(255), legenda tinyint );";

        try {
            PreparedStatement statement = this.connection.prepareStatement(servidor);

            statement.execute();
            statement.close();

            System.out.println("Tabela Criada");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Filme> listFilme() {
        String servidor = "SELECT * FROM Filme";

        try {
            PreparedStatement statement = this.connection.prepareStatement(servidor);

            List<Filme> filmes = new ArrayList<>();

            ResultSet list = statement.executeQuery();

            Filme filme;

            while (list.next()) {
                filme = new Filme();
                filme.setSala(list.getInt("sala"));
                filme.setTitulo(list.getString("titulo"));
                filme.setGenero(list.getString("genero"));
                filme.setDuracao(list.getString("duração"));
                filme.setLinguagem(list.getString("linguagem"));
                filme.setLegenda(list.getBoolean("legenda"));


                filmes.add(filme);
            }
            return filmes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
        public Filme findFilme(int sala) {
            String sql = "SELECT * FROM filme WHERE sala = ?";

            try {
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, sala);

                ResultSet resultSet = stmt.executeQuery();

                while (resultSet.next()){
                    Filme filme = new Filme();
                    filme.setSala(resultSet.getInt("sala"));
                    filme.setTitulo(resultSet.getString("titulo"));
                    filme.setGenero(resultSet.getString("genero"));
                    filme.setDuracao(resultSet.getString("duração"));
                    filme.setLinguagem(resultSet.getString("linguagem"));
                    filme.setLegenda(resultSet.getBoolean("legenda"));

                    return filme;
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            return null;
        }
    }
