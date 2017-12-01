/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietin;

import com.jfoenix.controls.JFXButton;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class AngkaController implements Initializable {

    @FXML
    private JFXButton satu;
    @FXML
    private JFXButton dua;
    @FXML
    private JFXButton tiga;
    @FXML
    private JFXButton empat;
    @FXML
    private JFXButton lima;
    @FXML
    private JFXButton enam;
    @FXML
    private JFXButton tujuh;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void satu1(ActionEvent event) {
        try{
        ((Node)(event.getSource())).getScene().getWindow().hide();
                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("harii1.fxml"));
                    Parent root = (Parent)fxmlLoader.load();
                    Scene scene = new Scene(root);

                    // Create new stage (window), then set the new Scene
                    Stage stage = new Stage();
                    stage.setResizable(false);
                    stage.setScene(scene);
                    stage.setTitle("DietIn");
                    stage.show();
            
             }catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
         }
        }
    

    @FXML
    private void dua2(ActionEvent event) {
        try{
        ((Node)(event.getSource())).getScene().getWindow().hide();
                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("harii2.fxml"));
                    Parent root = (Parent)fxmlLoader.load();
                    Scene scene = new Scene(root);

                    // Create new stage (window), then set the new Scene
                    Stage stage = new Stage();
                    stage.setResizable(false);
                    stage.setScene(scene);
                    stage.setTitle("DietIn");
                    stage.show();
            
             }catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
         }
    }

    @FXML
    private void tiga3(ActionEvent event) {
    try{
        ((Node)(event.getSource())).getScene().getWindow().hide();
                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("harii3.fxml"));
                    Parent root = (Parent)fxmlLoader.load();
                    Scene scene = new Scene(root);

                    // Create new stage (window), then set the new Scene
                    Stage stage = new Stage();
                    stage.setResizable(false);
                    stage.setScene(scene);
                    stage.setTitle("DietIn");
                    stage.show();
            
             }catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
         }
    }

    @FXML
    private void empat4(ActionEvent event) {
        try{
        ((Node)(event.getSource())).getScene().getWindow().hide();
                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("harii4.fxml"));
                    Parent root = (Parent)fxmlLoader.load();
                    Scene scene = new Scene(root);

                    // Create new stage (window), then set the new Scene
                    Stage stage = new Stage();
                    stage.setResizable(false);
                    stage.setScene(scene);
                    stage.setTitle("DietIn");
                    stage.show();
            
             }catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
         }
    }

     @FXML
    private void lima5(ActionEvent event) {
        try{
        ((Node)(event.getSource())).getScene().getWindow().hide();
                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("harii5.fxml"));
                    Parent root = (Parent)fxmlLoader.load();
                    Scene scene = new Scene(root);

                    // Create new stage (window), then set the new Scene
                    Stage stage = new Stage();
                    stage.setResizable(false);
                    stage.setScene(scene);
                    stage.setTitle("DietIn");
                    stage.show();
            
             }catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
         }
    }

    @FXML
    private void enam6(ActionEvent event) {
        try{
        ((Node)(event.getSource())).getScene().getWindow().hide();
                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("harii6.fxml"));
                    Parent root = (Parent)fxmlLoader.load();
                    Scene scene = new Scene(root);

                    // Create new stage (window), then set the new Scene
                    Stage stage = new Stage();
                    stage.setResizable(false);
                    stage.setScene(scene);
                    stage.setTitle("DietIn");
                    stage.show();
            
             }catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
         }
    }

    @FXML
    private void tujuh7(ActionEvent event) {
        try{
        ((Node)(event.getSource())).getScene().getWindow().hide();
                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("harii7.fxml"));
                    Parent root = (Parent)fxmlLoader.load();
                    Scene scene = new Scene(root);

                    // Create new stage (window), then set the new Scene
                    Stage stage = new Stage();
                    stage.setResizable(false);
                    stage.setScene(scene);
                    stage.setTitle("DietIn");
                    stage.show();
            
             }catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
         }
    }
    
}
