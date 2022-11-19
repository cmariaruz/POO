package Salario;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainFuncionario {

    public static void main(String[] args){

        BigDecimal salarioBase;
        String cpf;
        String nome;
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o funcionario:");
        System.out.println("Nome:");
        nome = input.next();
        System.out.println("CPF:");
        cpf = input.next();
        System.out.println("Salario:");
        salarioBase = input.nextBigDecimal();
        Funcionario funcionario = new Funcionario(nome, cpf,salarioBase);
        int diasTrabalhados;
        BigDecimal salarioMensal;


        try {
            System.out.println("Número de dias trabalhados:");
            diasTrabalhados = input.nextInt();
            salarioMensal = funcionario.calcularSalarioProporcional(funcionario,diasTrabalhados);
            System.out.println("Salário Proporcional: "+salarioMensal);
        } catch (ValidacaoException e) {
            System.out.println("Erro: " + e.getMessage());
        }finally {
            System.out.println(funcionario);
        }

    }
}
