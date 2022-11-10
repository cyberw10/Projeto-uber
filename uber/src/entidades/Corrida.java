package entidades;

import java.util.concurrent.atomic.AtomicInteger;

public class Corrida {
    private static final AtomicInteger count = new AtomicInteger(0);

    public String origem;
    public String destino;
    public String tipoCorrida;
    public Carro carro;
    public Motorista motorista;
    public Passageiro passageiro;
    public int codigo;

    public Corrida(Motorista motorista, Carro carro) {  // sobrecarga de construtor(corrida)
        this.motorista = motorista;
        this.carro = carro;
        this.codigo = count.incrementAndGet();
    }

    public Corrida(Motorista motorista, Carro carro, String origem, String destino, String tipoCorrida) {
        this.motorista = motorista;
        this.origem = origem;
        this.destino = destino;
        this.tipoCorrida = tipoCorrida;
        this.carro = carro;
        this.codigo = count.incrementAndGet();
    }

    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTipoCorrida() {
        return tipoCorrida;
    }

    public void setTipoCorrida(String tipoCorrida) {
        this.tipoCorrida = tipoCorrida;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void atualizarDados(Corrida corrida) {
        this.setPassageiro(corrida.getPassageiro());
        this.setMotorista(corrida.getMotorista());
        this.setCarro(corrida.getCarro());
        this.setDestino(corrida.getDestino());
        this.setOrigem(corrida.getOrigem());
        this.setTipoCorrida(corrida.getTipoCorrida());
    }
    
    public void atualizarDados( String origem, String Destino) {  // polimorfismo
        this.setDestino(destino);
        this.setOrigem(origem);
       
    }

    @Override
    public String toString() {
        return "codigo: " + this.codigo + ", " + "motorista: " + this.motorista + ", " + "passageiro: " + this.passageiro + ", " + "origem: " + this.origem + ", " + "destino: " + this.destino + ", " + "carro: " + this.carro.getModelo() + "\n";
    }
}
