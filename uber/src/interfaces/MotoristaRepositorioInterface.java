package interfaces;

import entidades.Motorista;
import java.util.List;

public interface MotoristaRepositorioInterface {
    public void adicionar(Motorista motorista);
    public void remover(String cpf);
    public void atualizar(String cpf, Motorista motorista);
    public Motorista encontrar(String cpf);
    public List<Motorista> listarTodos();
}
