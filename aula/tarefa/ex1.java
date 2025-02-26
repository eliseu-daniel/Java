import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){
        int dias = 0;
        int horas = 8*25;
        int salario = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de dias trabalhados");
        dias = entrada.nextInt();

        System.out.println("O salário do funcionário é:" + (dias*horas));

    }
}