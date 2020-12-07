package controller;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author Vitor da Silva Nascimento
 */

public class ScreenViewController implements Initializable {

    @FXML private JFXPasswordField password;

    @FXML private ToggleButton btnView;

    @FXML private JFXTextField passwordView;


    public void initialize(URL location, ResourceBundle resources) {
        btnView.setGraphic(new ImageView("/image/eyeOpen.png"));
        passwordView.setVisible(false);
        viewPass();

    }

    public void viewPass () {
        btnView.setOnAction(event -> {
                if(btnView.isSelected()){
                    passwordView.setText(password.getText());
                    password.setVisible(false);
                    passwordView.setVisible(true);
                    btnView.setGraphic(new ImageView("/image/eyeClosed.png"));

                }else{
                    password.setText(passwordView.getText());
                    password.setVisible(true);
                    passwordView.setVisible(false);
                    btnView.setGraphic(new ImageView("/image/eyeOpen.png"));
                }
        });
    }
}
