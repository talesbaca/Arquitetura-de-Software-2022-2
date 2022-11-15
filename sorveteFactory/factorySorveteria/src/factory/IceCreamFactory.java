package factory;

import domain.Baunilha;
import domain.Flocos;
import domain.Sorvete;

public class IceCreamFactory implements Factory {
	
    public Sorvete makeIceCream(String tipoSorvete){
    	
        switch(tipoSorvete.toLowerCase()){
            case "Flocos":
                return new Flocos();
            case "Baunilha":
                return new Baunilha();
            default:
                throw new UnsupportedOperationException("Animal desconhecido!");
        }
    }
}