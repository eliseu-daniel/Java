import java.util.Scanner;

public class Ex4{
    public static void main(String[] args){
        int inicio = 0;
        int fim = 0;
        int soma = 0;

        Scanner dado = new Scanner(System.in);

        System.out.println("Qual numero inicial?");
        inicio = dado.nextInt();

        System.out.println("Qual o numero final?");
        fim = dado.nextInt();

        for(int i = inicio; i <= fim; i++){
            if( (i % 2) == 0){
                soma += i;
            }
        }

        System.out.println("A soma dos pares é: " + soma);
    }
}