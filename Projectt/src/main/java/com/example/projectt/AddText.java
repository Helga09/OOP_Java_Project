package com.example.projectt;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AddText {
    static String value;

    public static String newWindow(String title) {

        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        Pane pane = new Pane();
        TextField textField1 = new TextField();
        Label label = new Label("Введіть значення елемента:");
        Button button = new Button("Додати значення");
        button.setOnAction(e -> {
            if(textField1.getText().isEmpty()){
                value="елемент";
            }
            else {
                value = textField1.getText();
            }
            window.close();
        });
        label.relocate(120, 100);
        textField1.relocate(120, 120);
        button.relocate(140, 160);

        pane.getChildren().addAll(label, textField1, button);
        Scene scene = new Scene(pane, 400, 300);
        window.setScene(scene);
        window.setTitle(title);
        window.showAndWait();
        return value;
    }

}
