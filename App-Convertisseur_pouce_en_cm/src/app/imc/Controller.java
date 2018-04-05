package app.imc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author Administrateur
 */
public class Controller {

    @FXML
    TextField cmField;
    @FXML
    TextField pouceField;
    @FXML
    TextField convertion;
    @FXML
    TextField convertion1;

    public void onClick(ActionEvent event) {
        String text = cmField.getText();
        String text1 = pouceField.getText();
        if ((text1 != null && text1.length() > 0) && (text != null && text.length() > 0)) {
            convertion1.setText(String.valueOf(Double.valueOf(pouceField.getText()) / 0.39370));
            convertion.setText(String.valueOf(Double.valueOf(cmField.getText()) * 0.39370));

        } else if (text1 != null && text1.length() > 0) {

            convertion1.setText(String.valueOf(Double.valueOf(pouceField.getText()) / 0.39370));
        } else if (text != null && text.length() > 0) {
            convertion.setText(String.valueOf(Double.valueOf(cmField.getText()) * 0.39370));
        } else {
            return;
        }

    }
}
