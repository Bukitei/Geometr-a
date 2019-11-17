package dad.javafx.hexagono;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.FloatExpression;

public class AreaHexagonoBinding extends DoubleBinding {

	private FloatExpression radio;
	
	public AreaHexagonoBinding(FloatExpression radio) {
		super();
		
		this.radio = radio;
		bind(radio);
		
		
	}
	@Override
	protected double computeValue() {
		
		double perimetro = radio.get() * 6; 
		double r = radio.get();

		double apotema = Math.sqrt(r*r - (r/2)*(r/2));
		
		return (apotema * perimetro) / 2;
	}

}
