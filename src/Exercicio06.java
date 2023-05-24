import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Digite o número inteiro para saber seu sucessor e antecessor: ");
        int numero = entrada_do_usuario.nextInt();
        int calculoSucessor = (numero + 1);
        int calculoAntecessor = (numero - 1);
        System.out.println("O antecessor do numero transcrito acima é " + calculoAntecessor +
                ". E seu sucessor é " + calculoSucessor);















    }
}
