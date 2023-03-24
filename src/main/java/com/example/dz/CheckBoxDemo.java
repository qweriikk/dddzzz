package com.example.dz;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CheckBoxDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
    Pane pane = new Pane();
    CheckBox checkBox1 = new CheckBox("da");
    CheckBox checkBox2 = new CheckBox("net");
    Text text = new Text();
    pane.getChildren().addAll(checkBox1, checkBox2, text);
    checkBox1.setLayoutX(20);
    checkBox1.setLayoutY(20);
    checkBox2.setLayoutX(20);
    checkBox2.setLayoutY(40);
    text.setX(20);
    text.setY(80);

    EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            if (checkBox1.isSelected() && !checkBox2.isSelected())
                text.setText("da is selected");
            else if (checkBox1.isSelected() && checkBox2.isSelected())
                text.setText("da and net are selected");
            else if (!checkBox1.isSelected() && checkBox2.isSelected())
                text.setText("net is selected");
            else text.setText("nothing is selected");

        }
    };

            checkBox1.setOnAction(handler);
            checkBox2.setOnAction(handler);

            Scene scene = new Scene(pane, 400, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }
