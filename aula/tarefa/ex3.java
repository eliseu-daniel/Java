import java.util.Scanner;

public class Ex3{
    public static void main(String[] args){
        String nome = "";
        String sexo = "homem";
        double  valor = 0.00;
        double total = 0.00;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu nome");
        nome = entrada.nextLine();

        System.out.println("Informe seu sexo");
        sexo = entrada.nextLine();

        System.out.println("Informe o valor da compra");
        valor = entrada.nextDouble();

        if(sexo.equals("homem")){
           total = valor - (valor*0.05);

           System.out.println("O valor a ser pago é de R$"+total);
        }
        if(sexo.equals("mulher")){
            total = valor - (valor*0.10);
           System.out.println("O valor a ser pago é de R$"+total);
        }
    }
}