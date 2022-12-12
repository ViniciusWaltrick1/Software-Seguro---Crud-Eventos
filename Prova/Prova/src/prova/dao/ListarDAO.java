package prova.dao;

import prova.model.Evento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ListarDAO {

    ResultSet rs;
    PreparedStatement ps;
    private Conexao con;

    public ListarDAO() {
        this.con = new Conexao();
    }

    public List<Evento> listaeventos() {
        List<Evento> eventos = new ArrayList<>();
        try {

            String query = "select * from eventos";
            ps = con.getConexao().prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                Evento evento = new Evento();
                evento.setNome(rs.getString(1));
                evento.setData(rs.getString(2));
                evento.setCidade(rs.getString(3));
                evento.setEndereco(rs.getString(4));
                evento.setPreco(rs.getDouble(5));
                evento.setQuant(rs.getInt(6));
                evento.setId(rs.getInt(7));

                eventos.add(evento);
            }

            return eventos;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return eventos;
    }
}
