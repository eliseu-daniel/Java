import java.util.Scanner;

class Ex3{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);

        int numero = 0;
        int tabuada = 0;

        System.out.println("Qual a tabuada que voce deseja?:");
        numero = dados.nextInt();

        System.out.println("A tabuada é:");
        for(int i = 0; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}