import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);

        double n1 = 0.00;
        double n2 = 0.00;
        double soma = 0.00;

        System.out.println("Digite o primeiro numero:");
        n1 = dados.nextDouble();

        System.out.println("Digite o segundo numero:");
        n2 = dados.nextDouble();

        soma = n1 + n2;

        System.out.println("A soma dos numeros é: " + soma);

    }
}