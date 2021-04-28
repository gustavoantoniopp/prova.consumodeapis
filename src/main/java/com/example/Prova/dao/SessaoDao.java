
package com.example.Prova.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.Prova.factory.ConnectionFactory;
import com.example.Prova.model.Sessao;
import com.example.Prova.model.Filme;


public class SessaoDao {

    private Connection connection = (new ConnectionFactory()).getConnection();

    public SessaoDao() {
    }

    public void newSessao() {
        String servidor = "create table if not exists Sessao " +
                "(sala INTEGER PRIMARY KEY auto_increment, horario time, filme VARCHAR(255), idFilme int, " +
                "foreign key (idFilme) references Filme(sala));";

        try {
            PreparedStatement statement = this.connection.prepareStatement(servidor);

            statement.execute();
            statement.close();

            System.out.println("Tabela Criada");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Sessao> listSessao() {
        String servidor = "SELECT * FROM Sessao";

        try {
            PreparedStatement statement = this.connection.prepareStatement(servidor);

            List<Sessao> sessoes = new ArrayList<>();

            ResultSet list = statement.executeQuery();

            Sessao sessao;

            while (list.next()) {
                sessao = new Sessao();
                sessao.setNumSala(list.getInt("sala"));
                sessao.setHorario(list.getString("Horario"));
                FilmeDao dao = new FilmeDao();
                Filme filme = dao.findFilme(list.getInt("sala"));
                sessao.setIdFilme(filme);

                sessoes.add(sessao);
            }
            return sessoes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
