package carros;

public class CarroMain {

    public static void main(String[] args) {

        Carro audi = new Carro();
        String marca;
        audi.modelo = "A1";
        audi.marca = "Audi";
        audi.cor = "Branco";
        audi.anoFabricacao = 2020;
        audi.placa = "CTX5E13";
        audi.acelerar();
        audi.acelerar();

        System.out.println("audi" + audi);

        Carro golBranco = new Carro();
        golBranco.modelo = "Gol";
        golBranco.cor = "Branco";
        golBranco.marca = "VW";
        Carro golPreto = new Carro();
        golPreto.modelo = "Gol";
        golPreto.cor = "Branco";
        golPreto.marca = "VW";


        System.out.println(golBranco == golPreto);
        System.out.println(golBranco.modelo == golPreto.modelo);
        System.out.println(golBranco.equals(golPreto));
        System.out.println(golBranco.modelo.equals(golPreto.modelo));
    }
}
