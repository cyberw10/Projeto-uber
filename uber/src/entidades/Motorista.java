package entidades;

import heranca.Pessoa;

public class Motorista extends Pessoa {

    public Motorista(String nome, String cpf) {
        super(nome, cpf); // serve para chamar o construtor da super classe.
    }

    public Motorista(String nome, String cpf, String dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    public void atualizarDados(Motorista motorista) {
        this.setNome(motorista.getNome());
        this.setDataNascimento(motorista.getDataNascimento());
        this.setCpf(motorista.getCpf());
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
