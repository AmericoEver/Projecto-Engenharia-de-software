/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Getset.edDTO;
import Getset.pwDTO;
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
public class pwDAO {

    ArrayList<pwDTO> lista = new ArrayList<>();
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public void excluirPW(int id_pw) {
        conn = new Conexao().connectBD();

        try {
            int apagar = JOptionPane.showConfirmDialog(null, "Tem Certeza que Pretende Remover o Profissional? ", "Actencao", JOptionPane.YES_NO_OPTION);
            if (apagar == JOptionPane.YES_OPTION) {
                pstm = conn.prepareStatement("delete from pw where id_pw like ?");
                pstm.setInt(1, id_pw);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Aula Excluido com Sucesso");
                pstm.close();
                conn.close();
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }

    public ArrayList<pwDTO> pesquisarcadastroDAO() {
        //pesquisa
        String sql = " select * from pw";

        conn = new Conexao().connectBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                pwDTO objpwDTO = new pwDTO();
                objpwDTO.setId_pw(rs.getInt("id_pw"));
                objpwDTO.setTema_pw(rs.getString("tema_pw"));
                objpwDTO.setConteudo_pw(rs.getString("conteudo_pw"));

                lista.add(objpwDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro na pesquisa do cadastro" + erro);
        }
        return lista;
    }

}
