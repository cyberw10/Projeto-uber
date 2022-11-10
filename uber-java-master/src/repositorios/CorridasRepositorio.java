package repositorios;

import entidades.Corrida;
import interfaces.CorridaRepositorioInterface;

import java.util.ArrayList;
import java.util.List;

public class CorridasRepositorio implements CorridaRepositorioInterface {

    List<Corrida> corridas = new ArrayList<Corrida>();

    @Override
    public void adicionar(Corrida corrida) {
        this.corridas.add(corrida);
    }

    @Override
    public void remover(int codigo) {
        Corrida corrida = this.encontrar(codigo);
        if (corrida != null) {
            this.corridas.remove(corrida);
        }
    }

    @Override
    public void atualizar(int codigo, Corrida corridaAtualizada) {
        Corrida corrida = this.encontrar(codigo);
        if (corrida != null) {
            corrida.atualizarDados(corrida);
        }
    }

    @Override
    public Corrida encontrar(int codigo) {
        for (Corrida corrida : this.corridas) {
            if (corrida.getCodigo() == codigo) {
                return corrida;
            }
        }
        return null;
    }

    @Override
    public List<Corrida> listarTodos() {
        return this.corridas;
    }

    @Override
    public List<Corrida> listarDisponiveis() {
        return this.corridas.stream().filter((corrida) -> corrida.getPassageiro() == null).toList();
    }
}
