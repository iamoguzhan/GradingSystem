package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    public void handleActionEvent (ActionEvent actionEvent) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/instructor.fxml"), null);
        Stage stage = new Stage();
        stage.setTitle("Instructor");
        stage.setScene(new Scene(root, 420, 330));
        stage.show();
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    }

    @FXML
    public void handleActionEventStudent(ActionEvent actionEvent) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/student.fxml"), null);
        Stage stage = new Stage();
        stage.setTitle("Student");
        stage.setScene(new Scene(root, 600, 450));
        stage.show();
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    }
}
