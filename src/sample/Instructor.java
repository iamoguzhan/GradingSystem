package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.*;


public class Instructor {

    @FXML
    private TextField insCourse;

    @FXML
    private TextField insStudent;

    @FXML
    private TextField insName;

    @FXML
    private TextField insGrade;

    @FXML
    private Button save;


    @FXML
    public void saveText(ActionEvent actionEvent) {
        String str1 = insCourse.getText();
        String str2 = insStudent.getText();
        String str3 = insName.getText();
        String str4 = insGrade.getText();


        FileWriter bw = null;


        if (insCourse.getText().equalsIgnoreCase("Maths")){

            try {
                bw = new FileWriter("maths.txt", true);
                bw.append("   " + str1 + "   " + str2 + "   " + str3 + "   " + str4 + System.lineSeparator());
                bw.close();

                insCourse.setText("");
                insStudent.setText("");
                insName.setText("");
                insGrade.setText("");


            } catch (IOException e1) {
                e1.printStackTrace();
            }

            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/instructor.fxml"), null);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setTitle("Instructor");
            stage.setScene(new Scene(root, 420, 330));
            stage.show();
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
        }

        else if (insCourse.getText().equalsIgnoreCase("Physics")){

            try {
                bw = new FileWriter("physics.txt", true);
                bw.append("   " + str1 + "   " + str2 + "   " + str3 + "   " + str4 + System.lineSeparator());
                bw.close();

                insCourse.setText("");
                insStudent.setText("");
                insName.setText("");
                insGrade.setText("");

            } catch (IOException e1) {
                e1.printStackTrace();
            }

            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/instructor.fxml"), null);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setTitle("Instructor");
            stage.setScene(new Scene(root, 420, 330));
            stage.show();
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
        }

        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Please enter a valid CourseID!");

            alert.showAndWait();
        }





    }




}
