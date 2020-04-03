package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class ApplicationUI extends FlowPane {
	
	private Button button1;
	private int count = 0;
	
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		button1 = new Button("ein Button");
		button1.setOnAction( event -> addLabel() );
	}
	private void addLabel() {
		count++;
		Label label = new Label ("Label" + count);	
		getChildren().add(label);
	}
	
	private void layoutControls() {
	setPadding(new Insets(7));
	getChildren().add(button1);
	setVgap(10);
	setHgap(10);
	}

}
