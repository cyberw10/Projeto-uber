package repositorios;

import entidades.Carro;
import entidades.Pagamento;
import interfaces.PagamentoRepositorioInterface;

import java.util.ArrayList;
import java.util.List;

public class PagamentoRepositorio implements PagamentoRepositorioInterface {

    List<Pagamento> pagamentos = new ArrayList<Pagamento>();

    @Override
    public void adicionar(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
    }

    @Override
    public void remover(int codigo) {
        Pagamento pagamento = this.encontrar(codigo);
        if (pagamento != null) {
            this.pagamentos.remove(pagamento);
        }
    }

    @Override
    public void atualizar(int codigo, Pagamento pagamentoAtualizado) {
        Pagamento pagamento = this.encontrar(codigo);
        if (pagamento != null) {
            pagamento.atualizarDados(pagamento);
        }
    }

    @Override
    public Pagamento encontrar(int codigo) {
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getCodigo() == codigo) {
                return pagamento;
            }
        }
        return null;
    }
}
