

public class ListaProduto{

    private String nomeProduto;
    private int qtdProduto;

    public void dados(String nome, int qtd)
    {
        this.nomeProduto = nome;
        this.qtdProduto = qtd;
    }

    public String getProduto()
    {
        return nomeProduto;
    }

    public void setProduto(String nome)
    {
        this.nomeProduto = nome;
    }

    public int getQtd()
    {
        return qtdProduto;
    }

    public void setQtd(int qtd)
    {
        this.qtdProduto = qtd;
    }

        public void Impressao()
    {
        System.out.println(nomeProduto + ", " + qtdProduto);
    }
}