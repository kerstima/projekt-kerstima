//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class tervitus extends Application {
    Stage window;
    Scene scene1;
    Scene scene2;
    Button button;
    Button button1;

    public tervitus() {
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        //See on start
        this.window = primaryStage;
        StackPane layout = new StackPane();
        Scene scene = new Scene(layout, 300.0D, 250.0D);
        this.window.setScene(scene);
        Label label1 = new Label("Häid pähi!");
        Button button1 = new Button("Oled ikka kindel?");
        button1.setOnAction((event) -> {
            this.window.setScene(this.scene2);
        });
        VBox layout1 = new VBox(20.0D);
        layout1.getChildren().addAll(new Node[]{label1, button1});
        this.scene1 = new Scene(layout1, 800.0D, 600.0D);
        Button button2 = new Button("Sulge");
        button2.setOnAction((event) -> {
            this.window.setScene(this.scene1);
        });
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        this.scene2 = new Scene(layout2, 800.0D, 600.0D);
        this.window.setScene(this.scene1);
        this.window.setTitle("pealkiri");
        this.window.show();
    }
}
