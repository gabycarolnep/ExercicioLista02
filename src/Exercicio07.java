import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Digite o valor ganho por hora trabalhada: ");
        double salarioHora = entrada_do_usuario.nextDouble();
        System.out.println("Digite o numero de horas trabalhadas no mês: ");
        double horasTrabalhoMensal = entrada_do_usuario.nextDouble();
        double calculoSalarioMensalBruto = ( salarioHora * horasTrabalhoMensal);
        double calculoINSS = (calculoSalarioMensalBruto * 0.08);
        double calculoSindicato = (calculoSalarioMensalBruto * 0.05);
        double calculoImpostoDeRenda = (calculoSalarioMensalBruto * 0.11);
        double calculoSalarioMensalLiquido = (calculoSalarioMensalBruto) - (calculoINSS + calculoSindicato + calculoImpostoDeRenda);
        System.out.println("Seu salário bruto mensal é: " + calculoSalarioMensalBruto);
        System.out.println("Você pagou ao INSS: " + calculoINSS + " reais" );
        System.out.println("Você pagou ao Sindicato: " + calculoSindicato + " reais");
        System.out.println("Seu salário líquido mensal é: " + calculoSalarioMensalLiquido);

















    }
}
