package carros;

import java.util.Objects;

public class Carro {

    String marca;
    String modelo;
    String placa;
    String cor;
    Integer anoFabricacao;  //este objeto está nulo

    boolean ligado;
    int velocidade;         //esta variável tem valor zero

    void ligar(){
        this.ligado = true;
    }

    void acelerar(){
        ligar();
        this.velocidade = this.velocidade + 10;
    }

    @Override
    //Mostra o estado do objeto em tipo string
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carro{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", placa='").append(placa).append('\'');
        sb.append(", cor='").append(cor).append('\'');
        sb.append(", anoFabricacao=").append(anoFabricacao);
        sb.append(", ligado=").append(ligado);
        sb.append(", velocidade=").append(velocidade);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo) && Objects.equals(cor, carro.cor) && Objects.equals(anoFabricacao, carro.anoFabricacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, cor, anoFabricacao);
    }
}
