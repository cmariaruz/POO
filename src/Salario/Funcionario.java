package Salario;

import java.util.Objects;

public class Funcionario {

    String nome;
    String cpf;
    Double salarioBase;


    public double calcularSalarioProporcional( int diasTrabalhados){
        return diasTrabalhados*salarioBase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Funcionario{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", cpf='").append(cpf).append('\'');
        sb.append(", salarioBase=").append(salarioBase);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf) && Objects.equals(salarioBase, that.salarioBase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, salarioBase);
    }
}
