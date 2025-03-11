import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){
        double comprimento = 0.00;
        double altura = 0.00;
        double area = 0.00;
        double total = 0.00;
        double tinta = 0.00;
        double ttT = 0.00;

        Scanner dado = new Scanner(System.in);

        System.out.println("Qual a altura do muro?");
        altura = dado.nextDouble();
        System.out.println("Qual o comprimento do muro?");
        comprimento = dado.nextDouble();

        area = altura * comprimento;

        tinta = area/3;

        ttT = tinta/4;

        total = 40*ttT;

        System.out.println("O total a ser gasto com tinta é:" + total);
        
    }
}