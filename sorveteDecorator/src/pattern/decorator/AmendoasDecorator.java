package pattern.decorator;

import pattern.domain.Sorvete;

public class AmendoasDecorator extends Decorator {
 
	public AmendoasDecorator(Sorvete sorvete) {
		this.sorvete = sorvete;
	}
 
	public String getDetalhes() {
		return sorvete.getDetalhes() + ", com adicional de amêndoas.";
	}
 
	public double getPreco() {
		return sorvete.getPreco() + 0.75; 
	}
}
