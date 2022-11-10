package servicos;

import entidades.Pagamento;
import interfaces.PagamentoRepositorioInterface;
import repositorios.PagamentoRepositorio;

public class PagamentoServico {
    PagamentoRepositorioInterface pagamentoRepositorio = new PagamentoRepositorio();

    public void adicionarPagamento(Pagamento pagamento) {
        this.pagamentoRepositorio.adicionar(pagamento);
    }

    public void removerPagamento(int codigo) {
        this.pagamentoRepositorio.remover(codigo);
    }

    public void atualizarPagamento(int codigo, Pagamento pagamento) {
        this.pagamentoRepositorio.atualizar(codigo, pagamento);
    }

    public Pagamento procurarPagamento(int codigo) {
        return this.pagamentoRepositorio.encontrar(codigo);
    }
}
