package projeto_integrador.Metadata;

import java.util.List;

import projeto_integrador.Metadata.Jogo.Base.Interfaces.IJogo;

public class Loterica {
	private Cidade cidade;
	private List<IJogo> jogos;
	private String nome;
	
	public Loterica(String nome, Cidade cidade) {
		this.cidade = cidade;
		this.nome = nome;
	}
	
	public List<IJogo> getJogos() {
		return jogos;
	}


	public void setJogos(List<IJogo> jogos) {
		this.jogos = jogos;
	}


	public String getNome() {
		return nome;
	}



	public Cidade getCidade() {
		return cidade;
	}
	
}
