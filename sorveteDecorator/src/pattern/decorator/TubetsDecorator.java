package pattern.decorator;

import pattern.domain.Sorvete;

public class TubetsDecorator extends Decorator {
 
	public TubetsDecorator(Sorvete sorvete) {
		this.sorvete = sorvete;
	}
 
	public String getDetalhes() {
		return sorvete.getDetalhes() + ", com adicional de tubets cobertos de chocolate";
	}
 
	public double getPreco() {
		return pizza.getPreco() + 2.5; 
	}
}