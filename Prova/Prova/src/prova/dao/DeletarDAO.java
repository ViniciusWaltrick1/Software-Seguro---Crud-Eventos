package prova.dao;

import prova.model.Evento;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletarDAO {
    private Conexao con;
    PreparedStatement ps;

    public DeletarDAO(){
        con = new Conexao();
    }

    public Boolean deletarevento(Evento evento){

        try{

            String query = "DELETE from eventos WHERE id=?";
            ps = con.getConexao().prepareStatement(query);

            if (evento.getId() == 0) {
                return false;
            }else{

                ps.setInt(1,evento.getId());

                ps.executeUpdate();

                return true;
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }

        return true;

    }
}
