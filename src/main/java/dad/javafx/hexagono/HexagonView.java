package dad.javafx.hexagono;

import dad.javafx.shapes.Polyhedron;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class HexagonView extends GridPane {

	private TextField radiusTxt;
	private Label areaTxt, perimeterTxt;
	private Label radiusLbl;
	private Label areaLbl, perimeterLbl;
	private Polyhedron hexagonShape;
	
	public HexagonView() {
		super();
		radiusLbl = new Label("Radio:");
		
		radiusTxt = new TextField();
		radiusTxt.setPromptText("Radio");
		radiusTxt.setPrefColumnCount(5);
		
		hexagonShape = new Polyhedron(40, 6);
		hexagonShape.setFill(Color.DARKMAGENTA);
		hexagonShape.setStrokeWidth(2);
		hexagonShape.setStroke(Color.BLACK);
		
		areaLbl = new Label("Area:");
		perimeterLbl = new Label("Perímetro:");
		
		areaTxt = new Label();
		perimeterTxt = new Label();
		
		addRow(0, radiusLbl, radiusTxt);
		addRow(1, hexagonShape);
		
		setColumnSpan(hexagonShape, 2);
		setHalignment(hexagonShape, HPos.CENTER);
		
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

	public Polyhedron getHexagonShape() {
		return hexagonShape;
	}
}
