import java.util.Scanner;

public class Produtos {
    public static void main(String[] arg) {
        // Scanner para ler dados do usuário
        Scanner item = new Scanner(System.in);

        // Instancia a classe ListaProduto
        ListaProduto produto = new ListaProduto();

        // Solicita ao usuário o nome do produto
        System.out.println("Item: ");
        String nome = item.nextLine();

        // Passa os dados para a classe ListaProduto
        produto.dados(nome, 1);

        // Chama o método para imprimir os dados
        produto.Impressao();
    }
}
