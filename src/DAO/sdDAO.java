/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Getset.edDTO;
import Getset.sdDTO;
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
public class sdDAO {

    ArrayList<sdDTO> lista = new ArrayList<>();
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public void excluirSD(int id_sd) {
        conn = new Conexao().connectBD();

        try {
            int apagar = JOptionPane.showConfirmDialog(null, "Tem Certeza que Pretende Remover o Profissional? ", "Actencao", JOptionPane.YES_NO_OPTION);
            if (apagar == JOptionPane.YES_OPTION) {
                pstm = conn.prepareStatement("delete from sd where id_sd like ?");
                pstm.setInt(1, id_sd);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Aula Excluido com Sucesso");
                pstm.close();
                conn.close();
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }

    public ArrayList<sdDTO> pesquisarcadastroDAO() {
        //pesquisa
        String sql = " select * from sd";

        conn = new Conexao().connectBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                sdDTO objsdDTO = new sdDTO();
                objsdDTO.setId_sd(rs.getInt("id_sd"));
                objsdDTO.setTema_sd(rs.getString("tema_sd"));
                objsdDTO.setConteudo_sd(rs.getString("conteudo_sd"));

                lista.add(objsdDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro na pesquisa do cadastro" + erro);
        }
        return lista;
    }

}
