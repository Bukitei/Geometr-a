package dad.javafx.circulo;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CircleView extends GridPane {

	private TextField radiusTxt;
	private Label areaTxt, perimeterTxt;
	private Label radiusLbl;
	private Label areaLbl, perimeterLbl;
	private Circle circleShape;
	
	public CircleView() {
		super();
		
		radiusLbl = new Label("Radio:");
		
		radiusTxt = new TextField();
		radiusTxt.setPromptText("Radio");
		radiusTxt.setPrefColumnCount(5);
		
		circleShape = new Circle();
		circleShape.setRadius(40);
		circleShape.setFill(Color.RED);
		circleShape.setStrokeWidth(2);
		circleShape.setStroke(Color.BLACK);
		
		areaLbl = new Label("Area:");
		perimeterLbl = new Label("Perímetro:");
		
		areaTxt = new Label();
		perimeterTxt = new Label();
		
		addRow(0, radiusLbl, radiusTxt);
		addRow(1, circleShape);
		
		setColumnSpan(circleShape, 2);
		setHalignment(circleShape, HPos.CENTER);
		
		addRow(2, areaLbl, areaTxt);
		addRow(3, perimeterLbl, perimeterTxt);
		
		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}

	public TextField getRadiusTxt() {
		return radiusTxt;
	}

	public Label getAreaTxt() {
		return areaTxt;
	}

	public Label getPerimeterTxt() {
		return perimeterTxt;
	}

	public Circle getCircleShape() {
		return circleShape;
	}
}
