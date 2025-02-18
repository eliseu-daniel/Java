import java.util.Scanner;

public class Area{
    public static void main(String[] args){
        double lado1 = 0.0;
        // double lado2 = 0.0;
        double area = 0.0;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o lado do quadrado em cm");
        lado1 = entrada.nextDouble();

        // System.out.println("Informe o lado 2 do quadrado em cm");
        // lado2 = entrada.nextDouble();

        area = lado1 * lado1;

        System.out.println("A área do quadrado é: " + area + "cm².");
    }
}