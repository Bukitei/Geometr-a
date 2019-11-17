package dad.javafx.triangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class TriangleController {

	private TriangleModel model;
	private TriangleView view;
	
	public TriangleController() {
		
		model = new TriangleModel();
		view = new TriangleView();
		
		// Usamos bind bidireccionales para transformar el texto en un número que el modelo pueda interpretar
		view.getBaseTxt().textProperty().bindBidirectional(model.baseProperty(), new NumberStringConverter());
		view.getHeightTxt().textProperty().bindBidirectional(model.heightProperty(), new NumberStringConverter());
		
		view.getAreaTxt().textProperty().bind(Bindings.selectString(model.areaProperty()));
		view.getPerimeterTxt().textProperty().bind(Bindings.selectString(model.perimeterProperty()));
	}
	
	public TriangleView getRoot() {
		return view;
	}
}
