import java.util.Scanner;

public class Ex5{
    public static void main(String[] args){
        double[] coleta = new double[10];
        double num = 0.00;
        double soma = 0.00;

        Scanner dados = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o "+ (i+1) + "° numero:");
            num = dados.nextDouble();

            coleta[i] = num;

            soma += num;
        }

        System.out.println("Os numeros digitados foram:");
        for(int i = 0; i < 10; i++){
            System.out.println(coleta[i]);
        }

        System.out.println("A soma dos numeros digitados foram: " + soma);
        System.out.println("A média dos numeros digitados foram: " + soma/10);

    }
}