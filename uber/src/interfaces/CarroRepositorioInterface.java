package interfaces;

import entidades.Carro;

public interface CarroRepositorioInterface {// criando metodos da interface carro
    public void adicionar(Carro carro);
    public void remover(String placa);
    public void atualizar(Carro carro);
    public Carro encontrar(String placa);
}
