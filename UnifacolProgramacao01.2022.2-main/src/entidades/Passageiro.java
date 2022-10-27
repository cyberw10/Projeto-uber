package entidades;

public abstract class Passageiro {

	private String nome;
	private String dataNascimento;
	private  String cpf;
	
	public Passageiro(String nome,String datanascimento, String cpf) {
		super();
		this.nome = nome;
		this.dataNascimento =datanascimento;
		this.cpf = cpf;
	}
	public Passageiro() {}
	
	public abstract String validarCpf(String cpf);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		
	}public String getdatanascimento() {
		return dataNascimento;
	}
	public void setdatanascimento(String datanascimento) {
		this.dataNascimento = datanascimento;
	}
	public String getCpf() {
		return cpf;
		
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
