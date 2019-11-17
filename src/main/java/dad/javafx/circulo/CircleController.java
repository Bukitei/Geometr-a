package dad.javafx.circulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class CircleController {

	private CircleModel model;
	private CircleView view;
	
	public CircleController() {
		
		model = new CircleModel();
		view = new CircleView();
		
		view.getRadiusTxt().textProperty().bindBidirectional(model.radiusProperty(), new NumberStringConverter());
		
		view.getAreaTxt().textProperty().bind(Bindings.selectString(model.areaProperty()));
		view.getPerimeterTxt().textProperty().bind(Bindings.selectString(model.perimeterProperty()));
	}
	
	public CircleView getRoot() {
		return view;
	}
}
