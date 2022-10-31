package com.example.projectt;

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
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    static int count = 0;

    @Override

    public void start(Stage primaryStage) throws IOException {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(5);
//        list.add(2);
//
//        //ToggleButton rectbtn = new ToggleButton("Rectange");
//        Button rectbtn = new Button("fuyfru");
//        VBox btns = new VBox(10);
//        btns.getChildren().addAll(rectbtn);
//        btns.setPadding(new Insets(5));
//        btns.setStyle("-fx-background-color: #999");
//        btns.setPrefWidth(100);
//
//        Canvas canvas = new Canvas(1080, 790);
//        GraphicsContext gc;
//        gc = canvas.getGraphicsContext2D();
//        gc.setLineWidth(1);
//
//        // Rectangle rect = new Rectangle();
//        Rectangle rect = new Rectangle(30, 30, 100, 100);
//
//
//        BorderPane pane = new BorderPane();
//        pane.setLeft(btns);
//        pane.setCenter(canvas);
//
//
//        Scene scene = new Scene(pane, 1200, 800);
//
//        primaryStage.setTitle("Paint");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        for (int i = 0; i < list.size(); i++) {
//            count++;
//            gc.fillRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
//            gc.strokeRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
//
//            rect.setX(rect.getX() + 110);
//            if (count % 9 == 0) {
//                rect.setX(30);
//
//                rect.setY(rect.getY() + 110);
//            }
//        }
//
//        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent e) {
//                count++;
//                gc.fillRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
//                gc.strokeRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
//
//                rect.setX(rect.getX() + 110);
//                if (count % 9 == 0) {
//                    rect.setX(30);
//
//                    rect.setY(rect.getY() + 110);
//                }
//                list.add(5);
//            }
//        };
//
//        rectbtn.setOnAction(event);

//        ColorPicker cpLine = new ColorPicker(Color.BLACK);
//        ColorPicker cpFill = new ColorPicker(Color.TRANSPARENT);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 860, 600);
        primaryStage.setTitle("ArrayList");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}