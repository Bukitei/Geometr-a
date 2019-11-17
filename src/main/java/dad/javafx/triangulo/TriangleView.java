package dad.javafx.triangulo;

import dad.javafx.shapes.Triangle;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class TriangleView extends GridPane {

	private TextField baseTxt, heightTxt;
	private Label areaTxt, perimeterTxt;
	private Label baseLbl, heightLbl;
	private Label areaLbl, perimeterLbl;
	private Triangle triangleShape;
	
	public TriangleView() {
		super();
		
		baseLbl = new Label("Base:");
		heightLbl = new Label("Altura:");
		
		baseTxt = new TextField();
		baseTxt.setPromptText("Base");
		baseTxt.setPrefColumnCount(5);
		heightTxt = new TextField();
		heightTxt.setPromptText("Altura");
		heightTxt.setPrefColumnCount(5);
		
		triangleShape = new Triangle(80,60);
		triangleShape.setFill(Color.GREEN);
		triangleShape.setStrokeWidth(2);
		triangleShape.setStroke(Color.BLACK);	
		
		areaLbl = new Label("Area:");
		perimeterLbl = new Label("Perímetro:");
		
		areaTxt = new Label();
		perimeterTxt = new Label();

		addRow(0, baseLbl, baseTxt);
		addRow(1, heightLbl, heightTxt);
		addRow(2, triangleShape);
		
		setColumnSpan(triangleShape, 2);
		setHalignment(triangleShape, HPos.CENTER);
		
		addRow(3, areaLbl, areaTxt);
		addRow(4, perimeterLbl, perimeterTxt);
		
		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}

	public TextField getBaseTxt() {
		return baseTxt;
	}

	public TextField getHeightTxt() {
		return heightTxt;
	}

	public Label getAreaTxt() {
		return areaTxt;
	}

	public Label getPerimeterTxt() {
		return perimeterTxt;
	}

	public Triangle getTriangleShape() {
		return triangleShape;
	}

}
