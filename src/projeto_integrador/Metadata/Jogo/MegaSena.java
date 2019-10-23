package projeto_integrador.Metadata.Jogo;

import java.util.ArrayList;
import java.util.List;

import projeto_integrador.Metadata.Jogo.Base.JogoBase;

public class MegaSena extends JogoBase {
	private List<Byte> rangeQuantidadeMinMaxNumerosSelecionar;
	
	public MegaSena() {
		this.rangeQuantidadeMinMaxNumerosSelecionar = new ArrayList<Byte>(10)
		{
			{			
				for (byte i = 6; i <= 15; i++) {
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
