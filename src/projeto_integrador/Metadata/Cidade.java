package projeto_integrador.Metadata;

public class Cidade {
	private Estado estado;
	private String nome;

	public Cidade(String nome, Estado estado) {
		this.estado = estado;
		this.nome = nome;
	}	
	
	public Estado getEstado() {
		return estado;
	}

	public String getNome() {
		return nome;
	}
}
