import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Digite o valor ganho por hora trabalhada: ");
        double salarioHora = entrada_do_usuario.nextDouble();
        System.out.println("Digite o numero de horas trabalhadas no mês: ");
        double horasTrabalhoMensal = entrada_do_usuario.nextDouble();
        double calculoSalarioMensal = ( salarioHora * horasTrabalhoMensal);
        System.out.println("Você recebe " + calculoSalarioMensal + "reais por mês");











    }
}
