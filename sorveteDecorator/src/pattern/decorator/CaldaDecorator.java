package pattern.decorator;

import pattern.domain.Sorvete;

public class CaldaDecorator extends Decorator {
 
	public CaldaDecorator(Sorvete sorvete) {
		this.sorvete = sorvete;
	}
 
	public String getDetalhes() {
		return sorvete.getDetalhes() + ", adicional de calda de chocolate";
	}
 
	public double getPreco() {
		return pizza.getPreco() + 1.75; 
	}
}