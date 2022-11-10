package interfaces;
import entidades.Corrida;
import java.util.List;

public interface CorridaRepositorioInterface {
    public void adicionar(Corrida corrida);
    public void remover(int codigo);
    public void atualizar(int codigo, Corrida corrida);
    public Corrida encontrar(int codigo);
    public List<Corrida> listarTodos();
    List<Corrida> listarDisponiveis();
}
