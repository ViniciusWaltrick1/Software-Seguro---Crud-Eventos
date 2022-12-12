package prova.dao;

import prova.model.Evento;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroDAO {
    private Conexao con;
    PreparedStatement ps;

    public CadastroDAO(){
        con = new Conexao();
    }

    public Boolean cadastrarevento(Evento evento){

        try{
            String query = "insert into eventos values (?, ?, ?, ?, ?, ?, ?)";
            ps = con.getConexao().prepareStatement(query);

            if (evento.getNome() == null || evento.getData() == null || evento.getCidade() == null || evento.getEndereco() == null) {
                return false;
            }else if (evento.getNome().isEmpty() || evento.getData().isEmpty() || evento.getCidade().isEmpty() || evento.getEndereco().isEmpty()){
                return false;
            }else{
                ps.setString(1, evento.getNome());
                ps.setString(2, evento.getData());
                ps.setString(3, evento.getCidade());
                ps.setString(4, evento.getEndereco());
                ps.setDouble(5, evento.getPreco());
                ps.setInt(6,evento.getQuant());
                ps.setInt(7,evento.getId());

                ps.execute();

                return true;
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }

        return true;

    }
}
