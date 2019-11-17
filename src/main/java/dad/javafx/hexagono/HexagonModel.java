package dad.javafx.hexagono;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.ReadOnlyFloatProperty;
import javafx.beans.property.ReadOnlyFloatWrapper;
import javafx.beans.property.SimpleFloatProperty;

public class HexagonModel {

	private FloatProperty radius = new SimpleFloatProperty();
	
	private ReadOnlyFloatWrapper area = new ReadOnlyFloatWrapper();
	private ReadOnlyFloatWrapper perimeter = new ReadOnlyFloatWrapper();
	
	
	public HexagonModel() {
		
		area.bind(new AreaHexagonoBinding(radiusProperty())); // Calculamos el área a partir del Teorema de Pitágoras, usamos nuestro propio Property
		perimeter.bind(radius.multiply(6)); // La suma de todos los lados, cada lado mide lo mismo que el radio
	}


	public final FloatProperty radiusProperty() {
		return this.radius;
	}
	


	public final float getRadius() {
		return this.radiusProperty().get();
	}
	


	public final void setRadius(final float radius) {
		this.radiusProperty().set(radius);
	}
	


	public final ReadOnlyFloatProperty areaProperty() {
		return this.area;
	}
	


	public final float getArea() {
		return this.areaProperty().get();
	}
	


	public final ReadOnlyFloatProperty perimeterProperty() {
		return this.perimeter;
	}
	


	public final float getPerimeter() {
		return this.perimeterProperty().get();
	}
	


	
	
	
	
	
	
}
