/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Getset.AulasDTO;
import Getset.edDTO;
import Getset.progDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Américo Ever
 */
public class progDAO {

    ArrayList<progDTO> lista = new ArrayList<>();
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public void excluirProg(int id_prog) {
        conn = new Conexao().connectBD();

        try {
            int apagar = JOptionPane.showConfirmDialog(null, "Tem Certeza que Pretende Remover o Profissional? ", "Actencao", JOptionPane.YES_NO_OPTION);
            if (apagar == JOptionPane.YES_OPTION) {
                pstm = conn.prepareStatement("delete  from programacao where id_prog like ?");
                pstm.setInt(1, id_prog);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Aula Excluido com Sucesso");
                pstm.close();
                conn.close();
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }

    public ArrayList<progDTO> pesquisarcadastroDAO() {
        //pesquisa
        String sql = " select * from programacao";

        conn = new Conexao().connectBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                progDTO objprogDTO = new progDTO();
                objprogDTO.setId_prog(rs.getInt("id_prog"));
                objprogDTO.setTema_prog(rs.getString("tema_prog"));
                objprogDTO.setConteudo_prog(rs.getString("conteudo_prog"));

                lista.add(objprogDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro na pesquisa do cadastro" + erro);
        }
        return lista;
    }

//    public void novaAula(AulasDTO objaulasDTO) {
//        String sql = "insert into aulas (nome_aula, conteudo_aula) values (?,?)";
//
//        conn = new Conexao().connectBD();
//
//        try {
//
//            pstm = conn.prepareStatement(sql);
//            pstm.setString(1, objaulasDTO.getNome_aula());
//            pstm.setBystes(2, objaulasDTO.getConteudo_aula());
//
//            pstm.execute();
//            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
//            pstm.close();
//
//        } catch (SQLException erro) {
//
//            JOptionPane.showMessageDialog(null, "erro no cadastroDAO" + erro);
//        }
//
//    }
}
