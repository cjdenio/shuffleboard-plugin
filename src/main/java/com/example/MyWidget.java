package com.example;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

@Description(name = "CoolWidget", dataTypes = String.class)
public class MyWidget extends SimpleAnnotatedWidget<String> {
    @Override
    public Pane getView() {
        Pane canvas = new Pane();
        canvas.setStyle("-fx-background-color: black;");
        canvas.setPrefSize(200, 200);
        Circle circle = new Circle(50, Color.BLUE);
        circle.relocate(20, 20);
        Rectangle rectangle = new Rectangle(100, 100, Color.RED);
        rectangle.relocate(70, 70);
        canvas.getChildren().addAll(circle, rectangle);

        return canvas;
    };
}
