package interfaces;

import entidades.Passageiro;

import java.util.List;

public interface PassageiroRepositorioInterface {
    public void adicionar(Passageiro passageiro);
    public void remover(String cpf);
    public void atualizar(String cpf, Passageiro passageiro);
    public Passageiro encontrar(String cpf);
    public List<Passageiro> listarTodos();
}
