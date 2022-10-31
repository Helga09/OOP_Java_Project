package com.example.projectt;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private FlowPane flowpane;
    @FXML
    private ScrollPane scrollpane;
    @FXML
    private ColorPicker cpLine;
    @FXML
    private ColorPicker cpFill;

    @FXML
    private Canvas canvas;
    static int count = 0;
    Rectangle rect = new Rectangle(30, 30, 100, 60);
    GraphicsContext gc;
    @FXML
    private Button add;

    @FXML
    protected void onHelloButtonClick() {

String buttonText =  AddText.newWindow("Додати значення");
          count++;

        gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(1);
        cpLine.setOnAction(e->{

            gc.setStroke(cpLine.getValue());
        });
        cpFill.setOnAction(e->{
            gc.setFill(cpFill.getValue());
        });
        gc.setStroke(cpLine.getValue());
        gc.setFill(cpFill.getValue());

        gc.fillRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
        gc.strokeRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());

        gc.setStroke(Color.rgb(0,0,0));
        gc.setFill(Color.rgb(0,0,0));
        gc.fillText(String.valueOf(count-1),rect.getX()+10,rect.getY()+15);
        gc.fillText(String.valueOf(buttonText),rect.getX()+40,rect.getY()+30);
        rect.setX(rect.getX() + 110);
        if (count % 5 == 0) {
            rect.setX(30);
            rect.setY(rect.getY() + 70);
        }

//
//        flowpane.getChildren().
//                setStroke(cpLine.getValue());
//        flowpane.setFill(cpFill.getValue());
//        flowpane.setStroke(cpLine.getValue());
//        flowpane.setFill(cpFill.getValue());
//
//        Rectangle rect = new Rectangle(30, 30, 100, 60);
//        flowpane.getChildren().add(rect);
    }


}