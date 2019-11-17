package dad.javafx.rectangulo;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class RectangleModel {

	private DoubleProperty width = new SimpleDoubleProperty();
	private DoubleProperty height = new SimpleDoubleProperty();
	
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper perimeter = new ReadOnlyDoubleWrapper();
	
	public RectangleModel() {
		
		area.bind(width.multiply(height));
		perimeter.bind(width.add(height).multiply(2));
	}

	public final DoubleProperty widthProperty() {
		return this.width;
	}
	

	public final double getWidth() {
		return this.widthProperty().get();
	}
	

	public final void setWidth(final double width) {
		this.widthProperty().set(width);
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
