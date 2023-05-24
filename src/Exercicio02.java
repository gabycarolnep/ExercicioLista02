import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Digite sua nota do primeiro bimestre: ");
        double bimestre1 = entrada_do_usuario.nextDouble();
        System.out.println("Digite sua nota do segundo bimestre: ");
        double bimestre2 = entrada_do_usuario.nextDouble();
        System.out.println("Digite sua nota do terceiro bimestre: ");
        double bimestre3 = entrada_do_usuario.nextDouble();
        System.out.println("Digite sua nota do quarto bimestre: ");
        double bimestre4 = entrada_do_usuario.nextDouble();
        double calculoMediaAritimetica = (bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4;
        System.out.println("Sua média é: " + calculoMediaAritimetica);













    }
}
