/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

    import java.sql.*; 
import java.util.ArrayList;
    import javax.swing.JOptionPane; 
/**
 *
 * @author Eliseu
 */
public class ClientesDAO {
    
     Connection conn; 
    PreparedStatement pstm; 
    ResultSet rs;
    ArrayList <ClientesDTO> lista = new ArrayList();
 
    public void cadastrarCliente(ClientesDTO objClientesDTO) { 
        String sql = "insert into clientes (nome, endereco, cidade, profissao) values (?,?,?,?)"; 
        //conn = (Connection) new Conexao(); 
         
        // connection = Conexao.getConexao(); 
        conn = Conexao.getConexao(); 
        try { 
            pstm = conn.prepareStatement(sql); 
            pstm.setString(1, objClientesDTO.getNome_cliente()); 
            pstm.setString(2, objClientesDTO.getEndereco_cliente()); 
            pstm.setString(3, objClientesDTO.getCidade_cliente()); 
            pstm.setString(4, objClientesDTO.getProfissao_cliente()); 
            pstm.execute(); 
            pstm.close(); 
        } catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        } 
    } 
    
    public ArrayList<ClientesDTO> ListarClientes() {
        String sql = "select * from clientes";
        conn = Conexao.getConexao();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery(sql);

            while (rs.next()) {
                ClientesDTO objClientesDTO = new ClientesDTO();
                objClientesDTO.setId_cliente(rs.getInt("id_cliente"));
                objClientesDTO.setNome_cliente(rs.getString("nome"));
                objClientesDTO.setEndereco_cliente(rs.getString("endereco"));
                objClientesDTO.setCidade_cliente(rs.getString("cidade"));
                objClientesDTO.setProfissao_cliente(rs.getString("profissao"));

                lista.add(objClientesDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }
    
    public void alterarCliente(ClientesDTO objClientesDTO) { 
        String sql = "update clientes set nome = ?, endereco = ?, cidade = ?, profissao  = ? where id_cliente = ?"; 
 
        conn = Conexao.getConexao(); 
        try { 
            pstm = conn.prepareStatement(sql); 
            pstm.setString(1, objClientesDTO.getNome_cliente()); 
            pstm.setString(2, objClientesDTO.getEndereco_cliente()); 
            pstm.setString(3, objClientesDTO.getCidade_cliente()); 
            pstm.setString(4, objClientesDTO.getProfissao_cliente()); 
            pstm.setInt(5, objClientesDTO.getId_cliente()); 
 
            pstm.execute(); 
            pstm.close(); 
 
        } catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e); 
        } 
    } 
}
