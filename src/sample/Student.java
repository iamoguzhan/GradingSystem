package sample;

import java.io.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class Student {


    @FXML
    private Button mat;

    @FXML
    private Button phy;


    @FXML
    private Label label;

    @FXML
    void getMat(ActionEvent event) {

        try{
            FileReader rdr = new FileReader("maths.txt");
            BufferedReader bufferedReader = new BufferedReader(rdr);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while((line = bufferedReader.readLine()) != null){
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            rdr.close();
            label.setText(stringBuffer.toString());

        }catch (IOException e){
            e.printStackTrace();
        }


    }

    @FXML
    void getPhy(ActionEvent event) {

        try{
            FileReader rdr = new FileReader("physics.txt");
            BufferedReader bufferedReader = new BufferedReader(rdr);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while((line = bufferedReader.readLine()) != null){
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            rdr.close();
            label.setText(stringBuffer.toString());

        }catch (IOException e){
            e.printStackTrace();
        }

    }



}
