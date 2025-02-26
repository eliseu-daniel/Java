import java.util.Scanner;

public class Ex2{
    public static void main(String[] args){
        String nome = "";
        double nota1 = 0.00;
        double nota2 = 0.00;
        double media = 0.00;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu nome");
        nome = entrada.nextLine();

        System.out.println("Informe a nota 1");
        nota1 = entrada.nextDouble();

        System.out.println("Informe a nota 2");
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2)/2;

        if(media >= 7)
        {
            System.out.println("Olá " + nome +" ,sua média é: " + media);
            System.out.println("Você está aprovado");
        }else if((media > 4) && (media < 7)){
            System.out.println("Olá " + nome +" ,sua média é: " + media);
            System.out.println("Você está de reprovado");
        }
        else{
            System.out.println("Olá " + nome +" ,sua média é: " + media);
            System.out.println("Você está aprovado");
        }
    }
}