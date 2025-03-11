import java.util.Scanner;

public class Ex3{
    public static void main(String[] args){
        double compra = 0.00;
        double pago = 0.00;
        double troco = 0.00;

        Scanner dado = new Scanner(System.in);

        System.out.println("Qual valor da compra?");
        compra = dado.nextDouble();

        System.out.println("Qual valor pago?");
        pago = dado.nextDouble();

        troco = pago - compra;

        System.out.println("O troco é: " + troco);
    }
}