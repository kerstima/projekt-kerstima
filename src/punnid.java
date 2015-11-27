import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class punnid extends tervitus {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;

        Button button = new Button("Tühjenda valikud");

        //Piimatooted punnid:
        CheckBox box1 = new CheckBox();
        CheckBox box2 = new CheckBox();
        CheckBox box3 = new CheckBox();
        CheckBox box4 = new CheckBox();
        CheckBox box5 = new CheckBox();
        CheckBox box6 = new CheckBox();
        CheckBox box7 = new CheckBox();


        HBox layout = new HBox(10); //spacing 10, Vbox paneb nupud yhes tulbas yksteise alla, Hbox kõrvale
        layout.setPadding(new Insets(20, 20, 20, 20)); //padding seab kauguse kasti ümber
        layout.getChildren().addAll(box1, box2, box3, box4, box5, box6, box7);

        //Teraviljatooted punnid
        CheckBox box8 = new CheckBox();
        CheckBox box9 = new CheckBox();
        CheckBox box10 = new CheckBox();
        CheckBox box11 = new CheckBox();
        CheckBox box12 = new CheckBox();
        CheckBox box13 = new CheckBox();
        CheckBox box14 = new CheckBox();

        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box8, box9, box10, box11, box12, box13, box14);

        //Rasvad
        CheckBox box15 = new CheckBox();
        CheckBox box16 = new CheckBox();
        CheckBox box17 = new CheckBox();
        CheckBox box18 = new CheckBox();
        CheckBox box19 = new CheckBox();
        CheckBox box20 = new CheckBox();
        CheckBox box21 = new CheckBox();

        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box15, box16, box17, box18, box19, box20, box21);

        //Proteiinid
        CheckBox box22 = new CheckBox();
        CheckBox box23 = new CheckBox();
        CheckBox box24 = new CheckBox();
        CheckBox box25 = new CheckBox();
        CheckBox box26 = new CheckBox();
        CheckBox box27 = new CheckBox();
        CheckBox box28 = new CheckBox();

        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box22, box23, box24, box25, box26, box27, box28);

        //Puuviljad
        CheckBox box29 = new CheckBox();
        CheckBox box30 = new CheckBox();
        CheckBox box31 = new CheckBox();
        CheckBox box32 = new CheckBox();
        CheckBox box33 = new CheckBox();
        CheckBox box34 = new CheckBox();
        CheckBox box35 = new CheckBox();

        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box29, box30, box31, box32, box33, box34, box35);

        //Juurikad
        CheckBox box36 = new CheckBox();
        CheckBox box37 = new CheckBox();
        CheckBox box38 = new CheckBox();
        CheckBox box39 = new CheckBox();
        CheckBox box40 = new CheckBox();
        CheckBox box41 = new CheckBox();
        CheckBox box42 = new CheckBox();

        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box36, box37, box38, box39, box40, box41, box42);

        //Vesi
        CheckBox box43 = new CheckBox();
        CheckBox box44 = new CheckBox();
        CheckBox box45 = new CheckBox();
        CheckBox box46 = new CheckBox();
        CheckBox box47 = new CheckBox();
        CheckBox box48 = new CheckBox();
        CheckBox box49 = new CheckBox();

        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box43, box44, box45, box46, box47, box48, box49);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }
}


//String btnOneText = btnOne.getText( )
//String textfieldText = txtDisplay.getText( )
//String btnThreeText = txtDisplay.getText() + btnThree.getText();
//txtDisplay.setText( btnThreeText );

