/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Getset.Captura_AcessoDTO;
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
public class CapturaDeAcessoDAO {
      Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Captura_AcessoDTO> lista = new ArrayList<>();
    
    public ArrayList<Captura_AcessoDTO> Capturar() {
        //pesquisa
        String sql = " select * from registro_acesso";

        conn = new Conexao().connectBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Captura_AcessoDTO objCaptura_AcessoDTO = new Captura_AcessoDTO();
                objCaptura_AcessoDTO.setId(rs.getInt("id_reg"));
               objCaptura_AcessoDTO.setNome("nome");
               objCaptura_AcessoDTO.setData_hora("data_hora");

                lista.add(objCaptura_AcessoDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro ao printar acesso" + erro);
        }
        return lista;
    }
    
}
