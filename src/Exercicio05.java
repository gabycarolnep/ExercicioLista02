import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Digite o valor em Fahrenheit que deseja converter para Celsius: ");
        double fahrenheit = entrada_do_usuario.nextDouble();
        double calculoConversao = (fahrenheit - 32) / 1.8;
        System.out.println("Seu valor em graus Celsius é: " + calculoConversao);











    }
}
