import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Digite o valor em metros que deseja converter para centímetros: ");
        double metros = entrada_do_usuario.nextDouble();
        double calculoConversao = (metros * 100);
        System.out.println("Seu valor em centímetros é: " + calculoConversao);











    }
}
