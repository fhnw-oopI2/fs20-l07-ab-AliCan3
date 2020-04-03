package ch.fhnw.oop2.module07.ab3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

public class ApplicationUI extends VBox {
	
	private TextField t_field;
	private Slider slider;
	private NumberStringConverter value;
	
	
	public ApplicationUI() {
		initializeControls();
		Margins();
		layoutControls();
	}
	
	private void initializeControls() {
		value = new NumberStringConverter();
		t_field = new TextField(value.toString());
		slider = new Slider(1, 10, 5.0);
		
		t_field.textProperty().bindBidirectional(slider.valueProperty(),value);
	}
	private void Margins() {
		setMargin(t_field, new Insets (10,10,10,10));
		setMargin(slider, new Insets (10,10,10,10));
	}
	private void layoutControls() {
	setAlignment(Pos.BASELINE_CENTER);
	getChildren().addAll(t_field,slider);
	slider.setShowTickLabels(true);
	slider.setShowTickMarks(true);
	slider.setMajorTickUnit(1);
	}

}
