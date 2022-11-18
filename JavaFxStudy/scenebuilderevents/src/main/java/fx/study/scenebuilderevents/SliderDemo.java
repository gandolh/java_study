package fx.study.scenebuilderevents;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class SliderDemo implements Initializable {
    @FXML
    Slider mySlider;
    @FXML
    Label myLabel;
    int myTemperature;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                myTemperature = ((int) mySlider.getValue());
                myLabel.setText(Integer.toString(myTemperature) + "°C");
            }
        });
    }
}
