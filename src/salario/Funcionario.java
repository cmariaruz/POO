package salario;

import java.math.BigDecimal;
import java.util.Objects;

public class Funcionario {

    private String nome;
    private String cpf;
    private BigDecimal salarioBase;

    public Funcionario (String nome, String cpf, BigDecimal salarioBase){
        setNome(nome);
        try {
            setSalarioBase(salarioBase);
        }catch (ValidacaoException e){
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            setCpf(cpf);
        }catch (ValidacaoException e){
            System.out.println("Erro: "+ e.getMessage());
        }


    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {

        this.nome = nome;
    }

    public String getCpf(){

        return cpf;
    }

    private void setCpf(String cpf) throws ValidacaoException{

        this.cpf = cpf;
        if (this.cpf.length()<11 || this.cpf==null){
            throw new ValidacaoException("CPF invalido.");
        }
    }

    public BigDecimal getSalarioBase() {

        return salarioBase;
    }

    private void setSalarioBase(BigDecimal salarioBase) throws ValidacaoException{

        this.salarioBase = salarioBase;
        if (this.salarioBase.toString().compareTo("0")==-1){
            throw new ValidacaoException("Salario menor que zero.");
        }

    }

    public BigDecimal calcularSalarioProporcional(Funcionario funcionario, int diasTrabalhados) throws ValidacaoException{
        if (diasTrabalhados <=0) {
            throw new ValidacaoException ("Numero de dias trabalhados menor que zero.");
        }

        BigDecimal salarioProporcional = funcionario.getSalarioBase().multiply(BigDecimal.valueOf(diasTrabalhados));
        return salarioProporcional;
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
