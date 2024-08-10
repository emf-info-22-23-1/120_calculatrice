/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.presentation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import app.helpers.JfxPopup;

/**
 * FXML Controller class
 *
 */
public class MainCtrl implements Initializable {


    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }


    public void quitter() {
        // faire qq chose avant de quitter
        // wrk.fermerBD();
        // System.out.println("Je vous quitte !");

        // obligatoire pour bien terminer une application JavaFX
        boolean quitter = JfxPopup.askConfirmation("Quitter", "", "Voulez-vous vraiment quitter l'application ?");
        
        if(quitter == true){
            Platform.exit();
        }
    }

}
