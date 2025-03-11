import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int funcionarios = 10;
        double somaTotal = 0;
        String nome = "";
        double salario = 0.00;
        int anos = 0;
        double novoSalario = 0.00;
        double percentualAumento = 0.00;

        for (int i = 1; i <= funcionarios; i++) {
            System.out.println("Funcionário " + i + ":");

            System.out.print("Nome: ");
            nome = dado.nextLine();

            System.out.print("Salário atual: ");
            salario = dado.nextDouble();

            System.out.print("Anos na empresa: ");
            anos = dado.nextInt();

            if (anos <= 3) {
                percentualAumento = 0.05;
            } else if (anos <= 10) {
                percentualAumento = 0.15;
            } else {
                percentualAumento = 0.20;
            }

            novoSalario = salario + (salario * percentualAumento);
            somaTotal += novoSalario;

            System.out.println(nome + " terá um novo salário de R$ " + novoSalario);
        }

        System.out.println("Soma total dos salários após o reajuste: R$ " + somaTotal);
    }
}
