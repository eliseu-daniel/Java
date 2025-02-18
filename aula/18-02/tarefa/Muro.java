import java.util.Scanner;

public class Muro{
    public static void main(String[] args){
        double lado1 = 0.0;
        double lado2 = 0.0;
        double area = 0.0;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a altura do muro em metros");
        lado1 = entrada.nextDouble();

        System.out.println("Informe o comprimento do muro em metros");
        lado2 = entrada.nextDouble();

        area = lado1 * lado2;

        System.out.println("A área do muro é: " + area + "m².");
    }
}