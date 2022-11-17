package repositorios;

import entidades.Carro;
import interfaces.CarroRepositorioInterface;

import java.util.ArrayList;
import java.util.List;

public class CarroRepositorio implements CarroRepositorioInterface { // metodoos que realizam as operações.
    List<Carro> carros = new ArrayList<Carro>(); 

    @Override // metodo usado  quando o polimorfismo é utilizado. ele apenas sobrescreve um emtodo e nao cria outro.
    public void adicionar(Carro carro) { 
        this.carros.add(carro); // this = nome do objeto qeu chamou.
    }

    @Override
    public void remover(String placa) {
        Carro carro = this.encontrar(placa);
        if (carro != null) {   // se for diferente de nulo ele remove.
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
