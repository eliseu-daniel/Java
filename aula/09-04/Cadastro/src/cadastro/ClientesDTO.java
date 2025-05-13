/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

/**
 *
 * @author Eliseu
 */
public class ClientesDTO {
     private String nome_cliente, endereco_cliente, cidade_cliente, profissao_cliente; 
     private int id_cliente;
    /**
     * @return the nome_cliente
     */
    public String getNome_cliente() {
        return nome_cliente;
    }

    /**
     * @param nome_cliente the nome_cliente to set
     */
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    /**
     * @return the endereco_cliente
     */
    public String getEndereco_cliente() {
        return endereco_cliente;
    }

    /**
     * @param endereco_cliente the endereco_cliente to set
     */
    public void setEndereco_cliente(String endereco_cliente) {
        this.endereco_cliente = endereco_cliente;
    }

    /**
     * @return the cidade_cliente
     */
    public String getCidade_cliente() {
        return cidade_cliente;
    }

    /**
     * @param cidade_cliente the cidade_cliente to set
     */
    public void setCidade_cliente(String cidade_cliente) {
        this.cidade_cliente = cidade_cliente;
    }

    /**
     * @return the profissao_cliente
     */
    public String getProfissao_cliente() {
        return profissao_cliente;
    }

    /**
     * @param profissao_cliente the profissao_cliente to set
     */
    public void setProfissao_cliente(String profissao_cliente) {
        this.profissao_cliente = profissao_cliente;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
}
