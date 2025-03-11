import java.util.Scanner;

public class Ex2{
    public static void main(String[] args){
        double horas = 0.00;
        double valor = 0.00;
        double desconto = 0.00;
        double total = 0.00;
        double salario = 0.00;

        Scanner dado = new Scanner(System.in);

        System.out.println("Quantas horas trabalhadas?");
        horas = dado.nextDouble();

        System.out.println("Qual o valor da hora?");
        valor = dado.nextDouble();

        System.out.println("Qual valor do desconto?");
        desconto = dado.nextDouble();

        total = horas*valor;
        salario = total - desconto;

        System.out.println("O salario bruto: "+ total + ", valor do desconto: " + desconto + ", salario liquido: "+ salario);
        
    }
}