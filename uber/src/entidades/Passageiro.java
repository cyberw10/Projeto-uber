package entidades;

import heranca.Pessoa;

public class Passageiro extends Pessoa {

    public Passageiro(String nome, String cpf) {
        super(nome, cpf);
    }

    public Passageiro(String nome, String cpf, String dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    public void atualizarDados(Passageiro passageiro) { 
        this.setNome(passageiro.getNome());
        this.setDataNascimento(passageiro.getDataNascimento());
        this.setCpf(passageiro.getCpf());
    }

    @Override
    public String toString() {
        return "{ nome: " + this.nome + ", " + "cpf: " + this.cpf + " }\n";
    }
}
