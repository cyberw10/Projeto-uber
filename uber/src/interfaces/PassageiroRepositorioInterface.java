package interfaces;

import entidades.Passageiro;

public interface PassageiroRepositorioInterface {
    public void adicionar(Passageiro passageiro);
    public void remover(String cpf);
    public void atualizar(String cpf, Passageiro passageiro);
    public Passageiro encontrar(String cpf);
}
