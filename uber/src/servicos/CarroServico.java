package servicos;

import entidades.Carro;
import interfaces.CarroRepositorioInterface;
import repositorios.CarroRepositorio;

public class CarroServico {
    CarroRepositorioInterface carroRepositorio = new CarroRepositorio(); // CarroRepositorio carroRepositorio = new CarroRepositorio()

    public void adicionarCarro(Carro carro) {
        this.carroRepositorio.adicionar(carro);
    }

    public void removerCarro(String placa) {
        this.carroRepositorio.remover(placa);
    }

    public void atualizarCarro(Carro carro) {
        this.carroRepositorio.atualizar(carro);
    }

    public Carro procurarCarroPorPlaca(String placa) {
        return this.carroRepositorio.encontrar(placa);
    }
}
