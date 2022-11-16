package pattern.decorator;

import pattern.domain.Sorvete;

public abstract class Decorator extends Sorvete {
	
	Sorvete sorvete;
	public abstract String getDetalhes();
	
}