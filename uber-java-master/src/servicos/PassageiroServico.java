package servicos;

import entidades.Motorista;
import entidades.Passageiro;
import interfaces.PassageiroRepositorioInterface;
import repositorios.PassageiroRepositorio;

import java.util.List;

public class PassageiroServico {
    PassageiroRepositorioInterface passageiroRepositorio = new PassageiroRepositorio();

    public void adicionarPassageiro(Passageiro passageiro) {
        this.passageiroRepositorio.adicionar(passageiro);
    }

    public void removerPassageiro(String cpf) {
        this.passageiroRepositorio.remover(cpf);
    }

    public void atualizarMotorista(String cpf, Passageiro passageiro) {
        this.passageiroRepositorio.atualizar(cpf, passageiro);
    }

    public Passageiro procurarPassageiro(String cpf) {
        return this.passageiroRepositorio.encontrar(cpf);
    }

    public List<Passageiro> listarPassageiros() {
        return this.passageiroRepositorio.listarTodos();
    }
}
