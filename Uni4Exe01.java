import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
//A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, 
//cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês,
// o valor por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
    
    //input
    System.out.println("Informe as horas trabalhadas");
    int horastrabalhadas = leitor.nextInt();

    System.out.println("Informe o valor por hora trabalhada");
    double valorhoras = leitor.nextInt();
    double salariosMes = valorhoras * horastrabalhadas;

    if(horastrabalhadas >= 160) {
        double valorDoBonus = (horastrabalhadas - 160) * (valorhoras / 2);
        salariosMes = salariosMes+ valorDoBonus;
    } 
//output
    System.out.println("O salário total é: " + salariosMes);

    leitor.close();
    
    }
}