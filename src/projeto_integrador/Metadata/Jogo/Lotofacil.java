package projeto_integrador.Metadata.Jogo;

import java.util.ArrayList;
import java.util.List;

import projeto_integrador.Metadata.Jogo.Base.JogoBase;

public class Lotofacil extends JogoBase{
	private List<Byte> rangeQuantidadeMinMaxNumerosSelecionar;	 

	public Lotofacil() {
		this.rangeQuantidadeMinMaxNumerosSelecionar = new ArrayList<Byte>(4)
		{
			{			
				for (byte i = 15; i <= 18; i++) {
					add(i);
				}
			}
		};
	}
	
	@Override
	public List<Byte> getRangeQuantidadeMinMaxNumerosSelecionar() {
		return rangeQuantidadeMinMaxNumerosSelecionar;
	}

}
