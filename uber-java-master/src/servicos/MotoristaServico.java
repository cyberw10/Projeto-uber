package servicos;

import entidades.Motorista;
import interfaces.MotoristaRepositorioInterface;
import repositorios.MotoristaRepositorio;

import java.util.List;

public class MotoristaServico {
    MotoristaRepositorioInterface motoristaRepositorio = new MotoristaRepositorio();

    public void adicionarMotorista(Motorista motorista) {
        this.motoristaRepositorio.adicionar(motorista);
    }

    public void removerMotorista(String cpf) {
        this.motoristaRepositorio.remover(cpf);
    }

    public void atualizarMotorista(String cpf, Motorista motorista) {
        this.motoristaRepositorio.atualizar(cpf, motorista);
    }

    public Motorista procurarMotorista(String cpf) {
        return this.motoristaRepositorio.encontrar(cpf);
    }

    public List<Motorista> listarTodos() {
        return this.motoristaRepositorio.listarTodos();
    }
}
