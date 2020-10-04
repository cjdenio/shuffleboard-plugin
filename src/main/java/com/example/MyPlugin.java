package com.example;

import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;
import edu.wpi.first.shuffleboard.api.plugin.Description;

import java.util.*;

@Description(group = "com.example", name = "MyPlugin", version = "1.2.3", summary = "An example plugin")
public class MyPlugin extends Plugin {
    public MyPlugin() {
        super();
        System.out.println("Hey world! How's it going?");
    }

    @Override
    public List<ComponentType> getComponents() {
        return List.of(WidgetType.forAnnotatedWidget(MyWidget.class));
    }
}
