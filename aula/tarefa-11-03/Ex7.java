import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        double horas = 0.00;
        double valor = 0.00;
        double desconto = 0.00;
        int funcionarios = 15;
        double salarioBruto = 0.00;
        double valorDesconto = 0.00;
        double salarioLiquido = 0.00;
        double totalBruto = 0.00;
        double totalDesconto = 0.00;
        double totalLiquido = 0.00;

        Scanner dado = new Scanner(System.in);

        for (int i = 1; i <= funcionarios; i++) {
            System.out.println("Funcionário " + i + ":");

            System.out.println("Qual as horas trabalhadas?");
            horas = dado.nextDouble();

            System.out.println("Qual valor da hora?");
            valor = dado.nextDouble();

            System.out.println("Qual a porcentagem do desconto?");
            desconto = dado.nextDouble();

            salarioBruto = horas * valor;
            valorDesconto = (salarioBruto * desconto) / 100;
            salarioLiquido = salarioBruto - valorDesconto;

            totalBruto += salarioBruto;
            totalDesconto += valorDesconto;
            totalLiquido += salarioLiquido;

            System.out.println("Salário Bruto: R$ " + salarioBruto);
            System.out.println("Valor do Desconto: R$ " + valorDesconto);
            System.out.println("Salário Líquido: R$ " + salarioLiquido);
        }

        System.out.println("Total Salário Bruto: R$ " + totalBruto);
        System.out.println("Total Desconto: R$ " + totalDesconto);
        System.out.println("Total Salário Líquido: R$ " + totalLiquido);
    }
}
