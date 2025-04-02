public class Pessoa {

    private int codigo;
    private String nome;
    private String endereco;
    private String cidade;
    private double salario;

    public Pessoa(int codigo, String nome, String endereco, String cidade, double salario ){
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.salario = salario;
    }

    public int getCodigo(){
        return codigo;
    }   

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getCidade(){
        return cidade;
    }

    public double getSalario(){
        return salario;
    }
}