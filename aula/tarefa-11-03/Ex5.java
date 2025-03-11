import java.util.Scanner;

public class Ex5{
    public static void main(String[] args){
        String nome = "";
        double salario = 0.00;
        int anos = 0;
        double reajuste = 0.00;

        Scanner dado = new Scanner(System.in);

        System.out.println("Qual nome do funcionario?");
        nome = dado.nextLine();

        System.out.println("Qual o salario dele?");
        salario = dado.nextDouble();

        System.out.println("Quantos anos de empresa ele tem?");
        anos = dado.nextInt();

        if(anos < 3){
            salario = salario + 0.05;
            System.out.println("O novo salario é" + salario);

        }else if((anos >= 3) && (anos < 10)){
            salario = salario + 0.15;
            System.out.println("O novo salario é" + salario);

        }else{
            salario = salario + 0.20;
            System.out.println("O novo salario é" + salario);
        }
    }
}