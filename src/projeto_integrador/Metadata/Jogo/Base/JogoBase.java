package projeto_integrador.Metadata.Jogo.Base;

import java.util.List;

import projeto_integrador.Metadata.Jogo.Base.Interfaces.IJogo;

public abstract class JogoBase implements IJogo {
	private List<Byte> numeros;	
	
	public abstract List<Byte> getRangeQuantidadeMinMaxNumerosSelecionar();
	
	@Override
	public final List<Byte> getNumeros() {		
		return numeros;
	}
}
