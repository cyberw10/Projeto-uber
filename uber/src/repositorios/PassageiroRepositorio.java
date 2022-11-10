package repositorios;

import entidades.Motorista;
import entidades.Passageiro;
import interfaces.PassageiroRepositorioInterface;

import java.util.ArrayList;
import java.util.List;

public class PassageiroRepositorio implements PassageiroRepositorioInterface {

    List<Passageiro> passageiros = new ArrayList<Passageiro>();

    @Override
    public void adicionar(Passageiro passageiro) {
    this.passageiros.add(passageiro);
    }

    @Override
    public void remover(String cpf) {
        Passageiro passageiro = this.encontrar(cpf);
        if (passageiro != null) {
            this.passageiros.remove(passageiro);
        }
    }

    @Override
    public void atualizar(String cpf, Passageiro passageiroAtualizado) {
        Passageiro passageiro = this.encontrar(cpf);
        if (passageiro != null) {
            passageiro.atualizarDados(passageiroAtualizado);
        }
    }

    @Override
    public Passageiro encontrar(String cpf) {
        for (Passageiro passageiro : this.passageiros) {
            if (passageiro.getCpf() == cpf) {
                return passageiro;
            }
        }
        return null;
    }
}
