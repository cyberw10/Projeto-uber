package repositorios;

import entidades.Motorista;
import interfaces.MotoristaRepositorioInterface;

import java.util.ArrayList;
import java.util.List;

public class MotoristaRepositorio implements MotoristaRepositorioInterface {

    List<Motorista> motoritas = new ArrayList<Motorista>();

    @Override
    public void adicionar(Motorista motorista) {
        this.motoritas.add(motorista);
    }

    @Override
    public void remover(String cpf) {
        Motorista motorista = this.encontrar(cpf);
        if (motorista != null) {
            this.motoritas.remove(motorista);
        }
    }

    @Override
    public void atualizar(String cpf, Motorista motoristaAtualizado) {
        Motorista motorista = this.encontrar(cpf);
        if (motorista != null) {
            motorista.atualizarDados(motoristaAtualizado);
        }
    }

    @Override
    public Motorista encontrar(String cpf) {
        for (Motorista motorista : this.motoritas) {
            if (motorista.getCpf() == cpf) {
                return motorista;
            }
        }
        return null;
    }

    @Override
    public List<Motorista> listarTodos() {
        return this.motoritas;
    }
}
