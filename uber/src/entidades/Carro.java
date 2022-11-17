package entidades;

import java.util.concurrent.atomic.AtomicInteger;

public class Carro {
//modificador de acesso
    private static final AtomicInteger count = new AtomicInteger(0); //atomicinteger é um metodo de contagem,
    public String modelo;                                // private static final usado para armezenada valores fixos
    public String placa; //atributos relacionado ao carro  
    public String cor;
    public int codigo;  // o codigo foi criado para numeração de cada carro

    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
        this.codigo = count.incrementAndGet(); // increment metodo para adicionar o count
    }

    public Carro(String modelo, String placa, String cor) { // polimorfismo criação do mesmo modificador de acesso com mais atributos
        this.modelo = modelo;    // this nome do objeto que chamou
        this.placa = placa;
        this.cor = cor;
        this.codigo = count.incrementAndGet(); //
    }

    public void atualizarDados(Carro carro) { // metodo de atualizar a cor/placa e modelo do carro
        this.setCor(carro.getCor());
        this.setPlaca(carro.getPlaca());
        this.setModelo(carro.getModelo());
    }

    public String getPlaca() { // get e set metodos para pegar informção de variveis da classe.
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "modelo: " + this.modelo + ", " + "placa: " + this.placa + ", " + "codigo: " + this.codigo + ", " + "cor: " + this.cor + "\n";
    }
}
