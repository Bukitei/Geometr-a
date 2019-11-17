package dad.javafx.rectangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class RectangleController {

	private RectangleModel model;
	private RectangleView view;
	
	public RectangleController() {
		
		model = new RectangleModel();
		view = new RectangleView();
		
		// Usamos bind bidireccionales para transformar el texto en un número que el modelo pueda interpretar
		view.getWidthTxt().textProperty().bindBidirectional(model.widthProperty(), new NumberStringConverter());
		view.getHeightTxt().textProperty().bindBidirectional(model.heightProperty(), new NumberStringConverter());
		
		view.getAreaTxt().textProperty().bind(Bindings.selectString(model.areaProperty()));
		view.getPerimeterTxt().textProperty().bind(Bindings.selectString(model.perimeterProperty()));
	}
	
	public RectangleView getRoot() {
		return view;
	}
}
