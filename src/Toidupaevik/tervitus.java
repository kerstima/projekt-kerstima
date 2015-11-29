
package Toidupaevik;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Polina on 28.11.2015.
 */
public class tervitus extends Application {

    Stage window;
    Scene scene;
    Button button;
    Label resultLabel;
    Label resultLabel1;


    public tervitus() {}

    private List<punnid> intValueCheckboxList = new ArrayList<>();

    Label tervitus=new Label("Tere armas kaalujälgija");


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

       punnid box1 = new punnid("Rasvata piim");
        intValueCheckboxList.add(box1);
        punnid box2 = new punnid("1% piim");
        intValueCheckboxList.add(box2);
        punnid box3 = new punnid("2,5% piim");
        intValueCheckboxList.add(box3);
        punnid box4 = new punnid("leib, keskmine viil, 30g");
        intValueCheckboxList.add(box4);
        punnid box5 = new punnid("sai, keskmine viil, 30g");
        intValueCheckboxList.add(box5);

        resultLabel = new Label();
        resultLabel1=new Label();


        this.button = new Button("Arvuta");
        this.button.setOnAction(( event) -> {
            this.calculate();
        });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(tervitus,box1, box2, box3,box4,box5, resultLabel,resultLabel1, this.button);
        this.scene = new Scene(layout, 500, 500);
        this.window.setScene(this.scene);
        this.window.show();
    }

    private void calculate() {
        int total = 0;
        int kogus = 2000;
        int jaak = 0;

        for (punnid box : intValueCheckboxList) {
            if (box.isSelected())
                total = total + box.getValue();
            jaak= kogus-total;
        }
        resultLabel.setText("Sa oled tarbinud - " + total + "kcal");
        resultLabel1.setText("Sa võid veel süüa - " + jaak+ "kcal");
    }}