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
    PreparedStatement pstm, pstmItem, pstmPedido; 
    ResultSet rs;
    ArrayList <ControllerDTO> lista = new ArrayList();
     public static int idUsuario;
    
    public ArrayList<ControllerDTO> ListarClientes(){
        String sql = "select * from cliente where cliente.idUser = ?";
        conn = Conexao.getConexao();
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, ModelDAO.idUsuario);
            rs = pstm.executeQuery();

            while(rs.next()){
                ControllerDTO objControllerDTO = new ControllerDTO();
                objControllerDTO.setIdCliente(rs.getInt("IdCliente"));
                objControllerDTO.setNomeCliente(rs.getString("nomeCliente"));
                objControllerDTO.setTelefoneCliente(rs.getString("telefoneCliente"));
                objControllerDTO.setEnderecoCliente(rs.getString("endereco"));
                lista.add(objControllerDTO);
            }
        }catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        }
        
        return lista;
    }

    public ArrayList<ControllerDTO> ListarProdutos(){
        String sql = "select * from produto where idUser = ?";
        conn = Conexao.getConexao();
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, ModelDAO.idUsuario);
            rs = pstm.executeQuery();

            while(rs.next()){
                ControllerDTO objControllerDTO = new ControllerDTO();
                objControllerDTO.setIdProduto(rs.getInt("IdProduto"));
                objControllerDTO.setNomeProduto(rs.getString("nomeProduto"));
                objControllerDTO.setValorProduto(rs.getDouble("valorProduto"));
                objControllerDTO.setImagemProduto(rs.getString("imagemProduto"));
                objControllerDTO.setDescProduto(rs.getString("descProduto"));
                lista.add(objControllerDTO);
            }
        }catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        }
        
        return lista;
    }

    public ArrayList<ControllerDTO> Historico(){
        String sql = "SELECT cliente.nomeCliente, produto.nomeProduto, pedido.dataPedido " +
             "FROM pedido " +
             "INNER JOIN itempedido ON pedido.idItemPedido = itempedido.idItemPedido " +
             "INNER JOIN cliente ON itempedido.idCliente = cliente.idCliente " +
             "INNER JOIN produto ON itempedido.idProduto = produto.idProduto " +
             "INNER JOIN usuario ON cliente.idUser = usuario.idUser " +
             "WHERE usuario.idUser = ?";
        
        conn = Conexao.getConexao();
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idUsuario);
            rs = pstm.executeQuery();

            while(rs.next()){
                ControllerDTO objControllerDTO = new ControllerDTO();
                objControllerDTO.setNomeCliente(rs.getString("cliente.nomeCliente"));
                objControllerDTO.setNomeProduto(rs.getString("produto.nomeProduto"));
                objControllerDTO.setDataPedido(rs.getString("pedido.dataPedido"));
                lista.add(objControllerDTO);
            }
        }catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        }
        
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

    public void cadastrarCliente(ControllerDTO objControllerDTO){
        String sql = "insert into cliente(idUser, nomeCliente, telefoneCliente, endereco) values(?,?,?,?)";

         conn = Conexao.getConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, idUsuario);
            
            pstm.setString(2, objControllerDTO.getNomeCliente());
            pstm.setString(3, objControllerDTO.getTelefoneCliente());
            pstm.setString(4, objControllerDTO.getEnderecoCliente());
            pstm.execute(); 
            pstm.close();
        }catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        } 
    }

    public void cadastrarProduto(ControllerDTO objControllerDTO){
        String sql = "insert into produto(idUser, nomeProduto, valorProduto, imagemProduto, descProduto) values(?,?,?,?,?)";

        conn = Conexao.getConexao();

        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idUsuario);
            pstm.setString(2, objControllerDTO.getNomeProduto());
            pstm.setDouble(3, objControllerDTO.getValorProduto());
            pstm.setString(4, objControllerDTO.getImagemProduto());
            pstm.setString(5, objControllerDTO.getDescProduto());
            pstm.execute();
            pstm.close();
        }catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        } 
    }

    public void alterarCliente(ControllerDTO objControllerDTO){
        String sql = "update cliente set nomeCliente = ?, telefoneCliente = ?, endereco = ? where IdCliente = ?";

        conn = Conexao.getConexao();
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objControllerDTO.getNomeCliente());
            pstm.setString(2, objControllerDTO.getTelefoneCliente());
            pstm.setString(3, objControllerDTO.getEnderecoCliente());
            pstm.setInt(4, objControllerDTO.getIdCliente());
            pstm.execute();
            pstm.close();
        }catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        } 
    }

    public void excluirCliente(ControllerDTO objControllerDTO){
        String sql = "delete from cliente where IdCliente = ?";

        conn = Conexao.getConexao();

        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objControllerDTO.getIdCliente());
            pstm.execute();
            pstm.close();
        }catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        } 
    }
    
    public void alterarProduto(ControllerDTO objControllerDTO){
        String sql = "update produto set nomeProduto = ?, valorProduto = ?, imagemProduto = ?, descProduto =? where IdProduto =?";

        conn = Conexao.getConexao();

        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objControllerDTO.getNomeProduto());
            pstm.setDouble(2, objControllerDTO.getValorProduto());
            pstm.setString(3, objControllerDTO.getImagemProduto());
            pstm.setString(4, objControllerDTO.getDescProduto());
            pstm.setInt(5, objControllerDTO.getIdProduto());
            pstm.execute();
            pstm.close();
        }catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        } 
    }

    public void excluirProduto(ControllerDTO objControllerDTO){
        String sql = "delete from produto where IdProduto = ?";

        conn = Conexao.getConexao();

        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objControllerDTO.getIdProduto());
            pstm.execute();
            pstm.close();
        }catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        } 
    }

    public ArrayList<ControllerDTO> pesquisarCliente(ControllerDTO objControllerDTO){
        String sql = "select * from cliente  where nomeCliente like ? and idUser = ?";

        conn = Conexao.getConexao();

        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%"+ objControllerDTO.getNomeCliente() + "%");
            pstm.setInt(2, idUsuario);
            rs = pstm.executeQuery();

            while(rs.next()){
                ControllerDTO cliente = new ControllerDTO();
                cliente.setIdCliente(rs.getInt("IdCliente"));
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setEnderecoCliente(rs.getString("endereco"));
                lista.add(cliente);
            }

            pstm.close();
            rs.close();

        }catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        } 
        
        return lista;
    }

    public void fazerPedido(ControllerDTO objControllerDTO){
        String sqlItem = "insert into itempedido(idCliente, idProduto, qtdItemPedido, valorItemPedido) values (?,?,?,?)";
        String sqlPedido = "insert into pedido(idItemPedido) values(?)";

        conn = Conexao.getConexao();

        try{
           pstmItem = conn.prepareStatement(sqlItem, Statement.RETURN_GENERATED_KEYS);
           pstmItem.setInt(1, objControllerDTO.getIdCliente());
           pstmItem.setInt(2, objControllerDTO.getIdProduto());
           pstmItem.setInt(3, objControllerDTO.getQtdItemPedido());
           pstmItem.setDouble(4, objControllerDTO.getValorItemPedido());
           pstmItem.executeUpdate();

           rs = pstmItem.getGeneratedKeys();
            int idItemPedidoGerado = -1;

            if (rs.next()) {
                idItemPedidoGerado = rs.getInt(1);
            } 
            
            pstmPedido = conn.prepareStatement(sqlPedido);
            pstmPedido.setInt(1, idItemPedidoGerado);
            pstmPedido.executeUpdate();
            rs.close();
            pstmItem.close();
            pstmPedido.close();

        }catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        }

    }

    public boolean Login(ControllerDTO objControllerDTO){
        boolean loginSucesso = false;
        
        String sql = "select idUser, emailUsuario, senhaUsuario from usuario where emailUsuario = ? and senhaUsuario = ?";
        
        conn = Conexao.getConexao();
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objControllerDTO.getEmailUsuario());
            pstm.setString(2, objControllerDTO.getSenhaUsuario());
            rs = pstm.executeQuery();
            
            if(rs.next()){
                ModelDAO.idUsuario = rs.getInt("idUser");
                
                loginSucesso = true;
            }
            rs.close();
            pstm.close();
            

        }catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        }
        return loginSucesso;
    }

     public ResultSet carregarCBX() { 
        conn = Conexao.getConexao(); 
        String sql = "select * from produto inner join usuario ON produto.idUser = usuario.idUser where usuario.idUser = ? order by nomeProduto"; 
        try { 
            pstm = conn.prepareStatement(sql); 
            pstm.setInt(1, idUsuario);
            return pstm.executeQuery(); 
        } catch (SQLException erro) { 
            System.out.println(erro.getMessage()); 
            return null; 
        } 
    } 
    
}
