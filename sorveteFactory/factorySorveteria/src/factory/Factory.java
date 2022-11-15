package factory;

import domain.Sorvete;

public interface Factory {
	
	public Sorvete makeIceCream(String iceFlavor);

}