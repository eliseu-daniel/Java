import java.util.Scanner;

public class Produtos {
    public static void main(String[] arg) {
        // Scanner para ler dados do usuário
        Scanner item = new Scanner(System.in);

        // Instancia a classe ListaProduto
        ListaProduto produto = new ListaProduto();

        System.out.println("Item: ");
        String nome = item.nextLine(); // Lê letras

        System.out.println("Qual a quantidade do itm?");
        int qtd = item.nextInt(); //Lê numeros
        produto.dados(nome, qtd);

        produto.Impressao();
    }
}
