package servicos;

import entidades.Corrida;
import interfaces.CorridaRepositorioInterface;
import repositorios.CorridasRepositorio;
import java.util.List;

public class CorridaServico {
    CorridaRepositorioInterface corridasRepositorio = new CorridasRepositorio();

    public void adicionarCorrida(Corrida corrida) {
        this.corridasRepositorio.adicionar(corrida);
    }

    public void removerCorrida(int codigo) {
        this.corridasRepositorio.remover(codigo);
    }

    public void atualizarCorrida(int codigo, Corrida corrida) {
        this.corridasRepositorio.atualizar(codigo, corrida);
    }

    public Corrida procurarCorrida(int codigo) {
        return this.corridasRepositorio.encontrar(codigo);
    }

    public List<Corrida> listarCorridas() {
        return corridasRepositorio.listarTodos();
    }

    public List<Corrida> listarCorridasDisponiveis() {
        return corridasRepositorio.listarDisponiveis();
    }
}
