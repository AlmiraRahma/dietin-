/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietin;


import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXDatePicker;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class RegistrasiController implements Initializable {
    
    @FXML
    private Button id_signup;
    @FXML
    private JFXDatePicker ttl;
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField alamat;
    @FXML
    private JFXTextField no;
    @FXML
    private JFXTextField username;
    @FXML
    private JFXTextField pass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signup(ActionEvent event) throws IOException {
         if(nama.getText().equals("")||alamat.getText().equals("")||no.getText().equals("")||
                username.getText().equals("")||pass.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Lengkapi data yang tertera");
    }else{
          try{
              String sql = "INSERT INTO user VALUES('"+nama.getText()+"','"+ttl.getValue()+"','"+alamat.getText()+"','"+no.getText()+"', '"+username.getText()+"', '"+pass.getText()+"')";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            
              ((Node)(event.getSource())).getScene().getWindow().hide();
                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
                    Parent root = (Parent)fxmlLoader.load();
                    Scene scene = new Scene(root);

                    // Create new stage (window), then set the new Scene
                    Stage stage = new Stage();
                    stage.setResizable(false);
                    stage.setScene(scene);
                    stage.setTitle("DietIn");
                    stage.show();
            
             }catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
         }}
}
}
