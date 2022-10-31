package Salario;

public class MainFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        funcionario1.salarioBase = 1800.00;
        funcionario1.cpf = "36832418884";
        funcionario1.nome = "Joao da Silva";

        Funcionario funcionario2 = new Funcionario();
        funcionario2.salarioBase = 1800.00;
        funcionario2.cpf = "36857536813";
        funcionario2.nome = "Joao da Silva";
        double salario = funcionario1.calcularSalarioProporcional(21);

        System.out.println(funcionario1);

        if (funcionario1.equals(funcionario2)){
            System.out.println("Funcionario ja criado!");
        }else {
            System.out.println(funcionario1.toString());
            System.out.println(funcionario2.toString());
        }


    }
}
