package dad.javafx.triangulo;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class TriangleModel {

	private DoubleProperty base = new SimpleDoubleProperty();
	private DoubleProperty height = new SimpleDoubleProperty();
	
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper perimeter = new ReadOnlyDoubleWrapper();
	
	public TriangleModel() {
		
		area.bind(base.multiply(height).divide(2)); // (Base * altura) / 2
		perimeter.bind(height.multiply(2).add(base)); // 2 * Altura + Base
	}

	public final DoubleProperty baseProperty() {
		return this.base;
	}
	

	public final double getBase() {
		return this.baseProperty().get();
	}
	

	public final void setBase(final double base) {
		this.baseProperty().set(base);
	}
	

	public final DoubleProperty heightProperty() {
		return this.height;
	}
	

	public final double getHeight() {
		return this.heightProperty().get();
	}
	

	public final void setHeight(final double height) {
		this.heightProperty().set(height);
	}
	

	public final javafx.beans.property.ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}
	

	public final double getArea() {
		return this.areaProperty().get();
	}
	

	public final javafx.beans.property.ReadOnlyDoubleProperty perimeterProperty() {
		return this.perimeter.getReadOnlyProperty();
	}
	

	public final double getPerimeter() {
		return this.perimeterProperty().get();
	}
	

	
}
