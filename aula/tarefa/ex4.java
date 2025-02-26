import java.util.Scanner;

public class Ex3{
    public static void main(String[] args){
        double largura = 0.0;
        double comprimento = 0.0;
        double area = 0.0;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o largura do quadrado em m");
        largura = entrada.nextDouble();

        System.out.println("Informe o largura do quadrado em m");
        comprimento = entrada.nextDouble();

        area = largura * comprimento;

        if(area < 100){
            System.out.println("A área é de:"+ area + " - TERRENO POPULAR");
        }else if((area > 100) && (area < 500)){
            System.out.println("A área é de:"+ area + " - TERRENO MASTER");
        }else{
            System.out.println("A área é de:"+ area + " - TERRENO VIP");
        }
    }
}