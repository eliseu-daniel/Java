import java.util.Scanner;

public class Media{
    public static void main (String[] args){
        String nome = "";
        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;
        double media = 0.0;
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu nome");
        nome = entrada.nextLine();

        System.out.println("Informe a nota 1");
        nota1 = entrada.nextDouble();

        System.out.println("Informe a nota 2");
        nota2 = entrada.nextDouble();

        System.out.println("Informe a nota 3");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3)/3;

        if(media < 6)
        {
            System.out.println("Olá " + nome +" ,sua média é: " + media);
            System.out.println("Você está reprovado");
        }else{
            System.out.println("Olá " + nome +" ,sua média é: " + media);
            System.out.println("Você está Aprovado");
        }


    }
}