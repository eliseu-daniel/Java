import java.util.Scanner;

public class Coleta {
    public static void Main(String[] args){

        int codigo;
        String nome;
        String endereco;
        String cidade;
        double salario;

        Pessoa[] pessoas = new Pessoa[5];

        Scanner dados = new Scanner(System.in);

        for(int i = 0; i < pessoas.length; i++){
            System.out.println("\nDigite os dados da " + (i+1) +"° pessoa. ");

            System.out.println("Digite o codigo da pessoa:");
            codigo = dados.nextInt();
            dados.nextLine();

            System.out.println("Digite o nome da pessoa:");
            nome = dados.nextLine();
            dados.nextLine();

            System.out.println("Digite o endereço da pessoa:");
            endereco = dados.nextLine();

            System.out.println("Digite a cidade da pessoa:");
            cidade = dados.nextLine();
            dados.nextLine();

            System.out.println("Digite o salario da pessoa R$:");
            salario = dados.nextDouble();
            dados.nextLine();

            pessoas[i] = new Pessoa(codigo, nome, endereco, cidade, salario);
        }

        for(int i = 0; i < pessoas.length; i++){
            System.out.println("\nPessoa: " + (i+1));

            System.out.println("Codigo: " + pessoas[i].getCodigo());
            System.out.println("Nome: " + pessoas[i].getNome());
            System.out.println("Endereço: " + pessoas[i].getEndereco());
            System.out.println("Cidade: " + pessoas[i].getCidade());
            System.out.println("Salário: " + pessoas[i].getSalario());
        }

        dados.close();
    }
}