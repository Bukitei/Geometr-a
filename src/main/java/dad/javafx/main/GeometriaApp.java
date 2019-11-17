package dad.javafx.main;

import dad.javafx.circulo.CircleController;
import dad.javafx.hexagono.HexagonController;
import dad.javafx.rectangulo.RectangleController;
import dad.javafx.triangulo.TriangleController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.stage.Stage;

public class GeometriaApp extends Application {
	
	private RectangleController rectangleController;
	private CircleController circleController;
	private TriangleController triangleController;
	private HexagonController hexagonController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		rectangleController = new RectangleController();
		circleController = new CircleController();
		triangleController = new TriangleController();
		hexagonController = new HexagonController();
		
		TabPane root = new TabPane();
		root.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE); // Para evitar que se cierren
		
		Tab tab1 = new Tab("Rectángulo");
		tab1.setContent(rectangleController.getRoot());
		
		Tab tab2 = new Tab("Círculo");
		tab2.setContent(circleController.getRoot());
		
		Tab tab3 = new Tab("Triángulo");
		tab3.setContent(triangleController.getRoot());
		
		Tab tab4 = new Tab("Hexágono");
		tab4.setContent(hexagonController.getRoot());
		
		root.getTabs().addAll(tab1, tab2, tab3, tab4);
		
		Scene scene = new Scene(root, 512, 256);
		primaryStage.setTitle("Geometría");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
