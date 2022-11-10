package entidades;

import java.util.concurrent.atomic.AtomicInteger;

public class Pagamento {
    private static final AtomicInteger count = new AtomicInteger(0);
    public String tipo; // dinheiro, cartao
    public Integer valor;

    public Corrida corrida;
    public int codigo;

    public Pagamento(String tipo, Integer valor, Corrida corrida) {
        this.tipo = tipo;
        this.valor = valor;
        this.corrida = corrida;
        this.codigo = count.incrementAndGet();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void atualizarDados(Pagamento pagamento) {
        this.setTipo(pagamento.getTipo());
        this.setValor(pagamento.getValor());
    }
    @Override
    public String toString() {
        return this.corrida + "tipo: " + this.tipo + ", " + "valor: " + this.valor + ", "+ "\n";
    }
}



