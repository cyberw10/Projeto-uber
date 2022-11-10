package interfaces;

import entidades.Carro;

public interface CarroRepositorioInterface {
    public void adicionar(Carro carro);
    public void remover(String placa);
    public void atualizar(Carro carro);
    public Carro encontrar(String placa);
}
