package entidades;

import java.util.concurrent.atomic.AtomicInteger;

public class Carro {

    private static final AtomicInteger count = new AtomicInteger(0);
    public String modelo;
    public String placa;
    public String cor;
    public int codigo;

    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
        this.codigo = count.incrementAndGet();
    }

    public Carro(String modelo, String placa, String cor) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.codigo = count.incrementAndGet();
    }

    public void atualizarDados(Carro carro) {
        this.setCor(carro.getCor());
        this.setPlaca(carro.getPlaca());
        this.setModelo(carro.getModelo());
    }

    public String getPlaca() {
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
