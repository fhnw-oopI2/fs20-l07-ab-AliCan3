package ch.fhnw.oop2.module07.ab2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
	
	private Label label;
	private Slider slider;
	
	public ApplicationUI() {
		initializeControls();
		Margins();
		layoutControls();
	}
	
	private void initializeControls() {
		label = new Label("5.0");
		slider = new Slider(1, 10, 5);
		slider.valueProperty().addListener((observableValue, oldValue, newValue)
				-> label.setText(String.valueOf(observableValue.getValue())));
	}

	private void Margins() {
		setMargin(label, new Insets (10,10,10,10));
		setMargin(slider, new Insets (10,10,10,10));
	}
	private void layoutControls() {
	setAlignment(Pos.BASELINE_CENTER);
	getChildren().addAll(label,slider);
	slider.setShowTickLabels(true);
	slider.setShowTickMarks(true);
	slider.setMajorTickUnit(1);
	slider.setSnapToTicks(true);
	}

}
