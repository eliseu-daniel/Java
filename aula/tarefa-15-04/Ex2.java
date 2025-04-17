import java.util.Scanner;

public class Ex2{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);

        double n1 = 0.00;
        double n2 = 0.00;
        int operacao = 0;
        double conta = 0.00;

        System.out.println("Digite o primeiro numero:");
        n1 = dados.nextDouble();

        System.out.println("Digite o segundo numero:");
        n2 = dados.nextDouble();

        System.out.println("Qual operação desenha fazer:");
        System.out.println("1 - adição");
        System.out.println("2 - subtração");
        System.out.println("3 - divisão");
        System.out.println("4 - multiplicação");

        operacao = dados.nextInt();

        if(operacao == 1){
            conta = n1 + n2;
            System.out.println("A soma é:" + conta);
        }else if(operacao == 2){
            conta = n1 - n2;
            System.out.println("A subtração é: " + conta);
        }else if(operacao == 3){
            conta = n1/n2;
            System.out.println("A divisão é: " + conta);
        }else if(operacao == 4){
            conta = n1 * n2;
            System.out.println("A multiplicação é: " + conta);
        }else{
            System.out.println("Opção invalida");
        }
    }
}