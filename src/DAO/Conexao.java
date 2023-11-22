/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author Américo Ever
// */
//public class Conexao {
//    
//    public Connection connectBD(){
//        Connection conn = null;
//        
//        try {
//            String url="jdbc:mysql://localhost/portal_aprendizagem?user=root&password=8883";
//           conn=DriverManager.getConnection(url);
//        } catch (SQLException erro) {
//            JOptionPane.showMessageDialog(null,"erro na clase de conexao"+erro.getMessage());
//        }
//        return conn;
//    }
//    
//}
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
//
//public class Conexao {
//    
//    public Connection connectBD() {
//        Connection conn = null;
//
//        try {
//           String url= "\"jdbc:mysql://localhost:3306/portal_aprendizagem\"?user=root&password= "; 
////           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/portal_aprendizagem", "root", "");
//            conn=DriverManager.getConnection(url);
//            // Verifica se a conexão foi bem-sucedida
//        } catch (SQLException erro) {
//            JOptionPane.showMessageDialog(null,"erro na clase de conexao"+erro.getMessage());
//        } 
//        return conn;
//    }
//}
//------------------vanilson-------------------
/*package conections;*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    public static Connection connectBD() {

        Connection conn = null;

        try {
            // Registre o driver MySQL (certifique-se de que o driver JDBC do MySQL esteja nas bibliotecas do projeto no NetBeans)
            Class.forName("com.mysql.jdbc.Driver");

            // Conecte ao banco de dados MySQL no XAMPP
            String url = "jdbc:mysql://localhost:3306/portal_aprendizagem";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException | ClassNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar ao Banco de Dados!" + erro.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
}
