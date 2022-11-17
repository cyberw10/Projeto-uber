package interfaces;

import entidades.Pagamento;

public interface PagamentoRepositorioInterface {
    public void adicionar(Pagamento pagamento);
    public void remover(int codigo);
    public void atualizar(int codigo, Pagamento pagamento);
    public Pagamento encontrar(int codigo);
}
