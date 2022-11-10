package repositorios;

import entidades.Carro;
import interfaces.CarroRepositorioInterface;

import java.util.ArrayList;
import java.util.List;

public class CarroRepositorio implements CarroRepositorioInterface {
    List<Carro> carros = new ArrayList<Carro>();

    @Override
    public void adicionar(Carro carro) {
        this.carros.add(carro);
    }

    @Override
    public void remover(String placa) {
        Carro carro = this.encontrar(placa);
        if (carro != null) {
            this.carros.remove(carro);
        }
    }

    @Override
    public void atualizar(Carro carroAtualizado) {
        Carro carro = this.encontrar(carroAtualizado.getPlaca());
        if (carro != null) {
            carro.atualizarDados(carroAtualizado);
        }
    }

    @Override
    public Carro encontrar(String placa) {
        for (Carro carro : this.carros) {
            if (carro.getPlaca() == placa) {
                return carro;
            }
        }
        return null;
    }
}
