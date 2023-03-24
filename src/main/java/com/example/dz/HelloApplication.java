package com.example.dz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();
        ScrollBar scrollBarV = new ScrollBar();
        scrollBarV.setOrientation(Orientation.VERTICAL);
        ScrollBar scrollBarH = new ScrollBar();
        Pane pane = new Pane();
        Text text = new Text("DOTA");
        text.setX(0);
        text.setY(0);
        pane.getChildren().addAll(text);

        borderPane.setCenter(pane);
        borderPane.setBottom(scrollBarH);
        borderPane.setRight(scrollBarV);

        text.xProperty().bind(scrollBarH.valueProperty().multiply(2));
        text.yProperty().bind(scrollBarV.valueProperty().multiply(2));


        Scene scene = new Scene(borderPane, 200, 200);
        stage.setScene(scene);
        stage.show();
    }
}