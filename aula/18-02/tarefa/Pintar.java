import java.util.Scanner;

public class Pintar{
    public static void main(String[] args){
        double lado1 = 0.0;
        double lado2 = 0.0;
        double area = 0.0;
        double tintaTT = 0.0;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a altura do muro em metros");
        lado1 = entrada.nextDouble();

        System.out.println("Informe o comprimento do muro em metros");
        lado2 = entrada.nextDouble();

        area = lado1 * lado2;

        tintaTT = area/6;

        System.out.println("A área do muro é: " + area + "m²");
        System.out.println("Você irá precisar de " + tintaTT + " latas de tinta");
    }
}