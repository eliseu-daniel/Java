/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedeja;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane; 

/**
 *
 * @author Eliseu
 */
public class ModelDAO {
    Connection conn; 
    PreparedStatement pstm; 
    ResultSet rs;
    ArrayList <ControllerDTO> lista = new ArrayList();
    
    public ArrayList<ControllerDTO> ListarClientes(){
        String sql = "select * from cliente";
        
        
        return lista;
    }
    
    public void cadastrarUsuario(ControllerDTO objControllerDTO){
        String sql = "INSERT INTO usuario(nomeUsuario, emailUsuario, senhaUsuario, telefoneUsuario) VALUES (?,?,?,?)";
        
        conn = Conexao.getConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objControllerDTO.getNomeUsuario());
            pstm.setString(2, objControllerDTO.getEmailUsuario());
            pstm.setString(3, objControllerDTO.getSenhaUsuario());
            pstm.setString(4, objControllerDTO.getTelefoneUsuario());
            pstm.execute(); 
            pstm.close();
        }catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        } 
    }
    
    public boolean Login(ControllerDTO objControllerDTO){
        boolean loginSucesso = false;
        
        String sql = "select emailUsuario, senhaUsuario from usuario where emailUsuario = ? and senhaUsuario = ?";
        
        conn = Conexao.getConexao();
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objControllerDTO.getEmailUsuario());
            pstm.setString(2, objControllerDTO.getSenhaUsuario());
            rs = pstm.executeQuery(); 
            
            if(rs.next()){
                loginSucesso = true;
            }
            rs.close();
            pstm.close();
            

        }catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        }
        return loginSucesso;
    }
    
}
