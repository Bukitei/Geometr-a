package dad.javafx.rectangulo;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectangleView extends GridPane {

	private TextField widthTxt, heightTxt;
	private Label areaTxt, perimeterTxt;
	private Label widthLbl, heightLbl;
	private Label areaLbl, perimeterLbl;
	private Rectangle rectangleShape;
	
	public RectangleView() {
		super();
		
		widthLbl = new Label("Ancho:");
		heightLbl = new Label("Alto:");
		
		widthTxt = new TextField();
		widthTxt.setPromptText("Ancho");
		widthTxt.setPrefColumnCount(5);
		heightTxt = new TextField();
		heightTxt.setPromptText("Alto");
		heightTxt.setPrefColumnCount(5);
		
		rectangleShape = new Rectangle();
		rectangleShape.setWidth(80);
		rectangleShape.setHeight(60);
		rectangleShape.setFill(Color.rgb(0, 162, 232));
		rectangleShape.setStrokeWidth(2);
		rectangleShape.setStroke(Color.BLACK);
		
		areaLbl = new Label("Area:");
		perimeterLbl = new Label("Perímetro:");
		
		areaTxt = new Label();
		perimeterTxt = new Label();

		addRow(0, widthLbl, widthTxt);
		addRow(1, heightLbl, heightTxt);
		addRow(2, rectangleShape);
		
		setColumnSpan(rectangleShape, 2);
		setHalignment(rectangleShape, HPos.CENTER);
		
		addRow(3, areaLbl, areaTxt);
		addRow(4, perimeterLbl, perimeterTxt);
		
		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}

	public TextField getWidthTxt() {
		return widthTxt;
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

	public Rectangle getRectangleShape() {
		return rectangleShape;
	}
}
