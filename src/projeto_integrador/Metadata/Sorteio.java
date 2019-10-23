package projeto_integrador.Metadata;

import java.util.List;

public class Sorteio {
	private List<Loterica> lotericas;
	private List<Byte> numerosSorteados;	
	
	public Sorteio(List<Loterica> loteriasParticipantes) {
		this.lotericas = loteriasParticipantes;
	}
	
	public List<Loterica> getLoterias() {		
		return lotericas;
	}

	public List<Byte> getNumerosSorteados() {
		return numerosSorteados;
	}
}
