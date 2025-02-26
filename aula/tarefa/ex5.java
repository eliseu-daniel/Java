import java.util.Scanner;

public class Ex5{
    public static void main(String[] args){
        double n1;
        double n2;
        double n3;
        double n4;
        double n5;
        double n6;
        double n7;
        double soma;
        double media;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe numero 1");
        n1 = entrada.nextDouble();
        System.out.println("Informe numero 2");
        n2 = entrada.nextDouble();
        System.out.println("Informe numero 3");
        n3 = entrada.nextDouble();
        System.out.println("Informe numero 4");
        n4 = entrada.nextDouble();
        System.out.println("Informe numero 5");
        n5 = entrada.nextDouble();
        System.out.println("Informe numero 6");
        n6 = entrada.nextDouble();
        System.out.println("Informe numero 7");
        n7 = entrada.nextDouble();

        System.out.println("a soma deles é:" +(soma = (n1+n2+n3+n4+n5+n6+n7)));
        System.out.println("a media deles é:" + (soma/7));
    }
}