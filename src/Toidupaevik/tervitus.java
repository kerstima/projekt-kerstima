
package Toidupaevik;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class tervitus extends Application {

    Stage window;
    Button button;
    Label resultLabel;
    Label resultLabel1;
    ListView<String> listView;
    private List<punnid> intValueCheckboxList = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        resultLabel = new Label();
        resultLabel1 = new Label();

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10)); //tekitab 10pixelise ääre ümber
        grid.setVgap(10);//tekitab vertikaalselt vahed
        grid.setHgap(10); //horisontaalselt vahed

        Label tervitus =new Label("Tere kaalujälgija!");
        GridPane.setConstraints(tervitus, 0, 0);//seab sildi esimesse tulpa ja esimesse lahtrisse

        Label Piimatooted = new Label("Piimatooted");
        GridPane.setConstraints(Piimatooted, 0, 2);//esimene on tulba, teine rea number
        Label Piim = new Label("2 portsu");
        GridPane.setConstraints(Piim, 0, 3);

        punnid box1 = new punnid("Rasvata piim, 300 ml");
        intValueCheckboxList.add(box1);
        GridPane.setConstraints(box1, 0, 4);
        punnid box2 = new punnid("1% piim, 200 ml");
        intValueCheckboxList.add(box2);
        GridPane.setConstraints(box2, 0, 5);
        punnid box3 = new punnid("2,5% piim, 200 ml");
        intValueCheckboxList.add(box3);
        GridPane.setConstraints(box3, 0, 6);
        punnid box4 = new punnid("1% keefiir, 200 ml");
        intValueCheckboxList.add(box4);
        GridPane.setConstraints(box4, 0, 7);
        punnid box5 = new punnid("2,5% keefir, 100 ml");
        intValueCheckboxList.add(box5);
        GridPane.setConstraints(box5, 0, 8);
        punnid box6 = new punnid("jogurt (<100 cal), 100 ml");
        intValueCheckboxList.add(box6);
        GridPane.setConstraints(box6, 0, 9);


        Label Teraviljatooted = new Label("Teraviljatooted");
        GridPane.setConstraints(Teraviljatooted, 1, 2);
        Label Tera = new Label("4 portsu");
        GridPane.setConstraints(Tera, 1, 3);

        punnid box7 = new punnid("leib, keskmine viil, 30 g");
        intValueCheckboxList.add(box1);
        GridPane.setConstraints(box7, 1, 4);
        punnid box8 = new punnid("makaronid keedetud, 100 ml");
        intValueCheckboxList.add(box8);
        GridPane.setConstraints(box8, 1, 5);
        punnid box9 = new punnid("puder (riis, tatar, manna jt) 100 ml");
        intValueCheckboxList.add(box9);
        GridPane.setConstraints(box9, 1, 6);
        punnid box10 = new punnid("helbed (kaera, riisi jne) 75 ml");
        intValueCheckboxList.add(box10);
        GridPane.setConstraints(box10, 1, 7);
        punnid box11 = new punnid("müsli, 3 spl");
        intValueCheckboxList.add(box11);
        GridPane.setConstraints(box11, 1, 8);
        punnid box12 = new punnid("herned (toored, konserv) 120 g");
        intValueCheckboxList.add(box12);
        GridPane.setConstraints(box12, 1, 9);
        punnid box13 = new punnid("mais (toores, konserv) 80 g");
        intValueCheckboxList.add(box13);
        GridPane.setConstraints(box13, 1, 10);
        punnid box14 = new punnid("kartul 2 pisikest v 1 keskmine");
        intValueCheckboxList.add(box14);
        GridPane.setConstraints(box14, 1, 11);

        Label Rasvad = new Label("Rasvad");
        GridPane.setConstraints(Rasvad, 2, 2);
        Label Rasv = new Label("2 portsu");
        GridPane.setConstraints(Rasv, 2, 3);

        punnid box15 = new punnid("majonees, 1 tl");
        intValueCheckboxList.add(box15);
        GridPane.setConstraints(box15, 2, 4);
        punnid box16 = new punnid("taimeõli, 1 tl");
        intValueCheckboxList.add(box16);
        GridPane.setConstraints(box16, 2, 5);
        punnid box17 = new punnid("pähklid 7g, ca 5tk");
        intValueCheckboxList.add(box17);
        GridPane.setConstraints(box17, 2, 6);
        punnid box18 = new punnid("juust, 30 g");
        intValueCheckboxList.add(box18);
        GridPane.setConstraints(box18, 2, 7);

        Label Proteiinid = new Label("Proteiinid");
        GridPane.setConstraints(Proteiinid, 3, 2);
        Label Prot = new Label("3 portsu");
        GridPane.setConstraints(Prot, 3, 3);

        punnid box19 = new punnid("liha (kana, veis, väherasvane siga jt) 30 g");
        intValueCheckboxList.add(box19);
        GridPane.setConstraints(box19, 3, 4);
        punnid box20 = new punnid("kala (heik, lest jt väherasvased) 60 g");
        intValueCheckboxList.add(box20);
        GridPane.setConstraints(box20, 3, 5);
        punnid box21 = new punnid("kala (angerjas, lõhe, räim, suitsukala) 30 g");
        intValueCheckboxList.add(box21);
        GridPane.setConstraints(box21, 3, 6);
        punnid box22 = new punnid("kodujuust 80 g");
        intValueCheckboxList.add(box22);
        GridPane.setConstraints(box22, 3, 7);
        punnid box23 = new punnid("kohupiim < 10 % rasva, 80 g");
        intValueCheckboxList.add(box23);
        GridPane.setConstraints(box23, 3, 8);
        punnid box24 = new punnid("vähk, krabi, krabipulk, 30 g");
        intValueCheckboxList.add(box24);
        GridPane.setConstraints(box24, 3, 9);
        punnid box25 = new punnid("vorst, poolfabrikaadid, 30 g");
        intValueCheckboxList.add(box25);
        GridPane.setConstraints(box25, 3, 10);
        punnid box26 = new punnid("muna, 1 tk");
        intValueCheckboxList.add(box26);
        GridPane.setConstraints(box26, 3, 11);

        Label Puuviljad = new Label("Puuviljad");
        GridPane.setConstraints(Puuviljad, 4, 2);
        Label Puuv = new Label("3 portsu");
        GridPane.setConstraints(Puuv, 4, 3);

        punnid box27 = new punnid("apelsin, 1 keskmine");
        intValueCheckboxList.add(box27);
        GridPane.setConstraints(box27, 4, 4);
        punnid box28 = new punnid("banaan, 1/2");
        intValueCheckboxList.add(box28);
        GridPane.setConstraints(box28, 4, 5);
        punnid box29 = new punnid("greip, 1/2");
        intValueCheckboxList.add(box29);
        GridPane.setConstraints(box29, 4, 6);
        punnid box30 = new punnid("kiivi, 1 tk");
        intValueCheckboxList.add(box30);
        GridPane.setConstraints(box30, 4, 7);
        punnid box31 = new punnid("õun, 1 keskmine");
        intValueCheckboxList.add(box31);
        GridPane.setConstraints(box31, 4, 8);
        punnid box32 = new punnid("viinamarjad 100 g");
        intValueCheckboxList.add(box32);
        GridPane.setConstraints(box32, 4, 9);
        punnid box33 = new punnid("nektariin, 1 keskmine");
        intValueCheckboxList.add(box33);
        GridPane.setConstraints(box33, 4, 10);
        punnid box34 = new punnid("pirn, 1 keskmine");
        intValueCheckboxList.add(box34);
        GridPane.setConstraints(box34, 4, 11);
        punnid box35 = new punnid("ploom, 3 keskmist");
        intValueCheckboxList.add(box35);
        GridPane.setConstraints(box35, 4, 12);
        punnid box36 = new punnid("marjad 120 g");
        intValueCheckboxList.add(box36);
        GridPane.setConstraints(box36, 4, 13);


        button = new Button("Arvuta");
        GridPane.setConstraints(button, 1, 14);

        grid.getChildren().addAll(tervitus, Piimatooted,Piim, box1, box2, box3,box4,box5,box6, Teraviljatooted,Tera, box7, box8, box9, box10, box11, box12, box13, box14, Rasvad, Rasv, box15, box16, box17, box18, Proteiinid, Prot, box19, box20, box21, box22, box23, box24, box25, box26, Puuviljad,Puuv, box27, box28, box29, box30, box31, box32, box33, box34, box35, box36, resultLabel, resultLabel1, button);
        Scene scene = new Scene(grid, 1200, 500);
        window.setScene(scene);
        window.show();

        button.setOnAction((event) -> {
            calculate();
        });

    }

    private void calculate() {
        int total = 0;
        int kogus = 2000;
        int jaak = 0;

        for (punnid box : intValueCheckboxList){
            if (box.isSelected())total = total + box.getValue();
            jaak = kogus - total;
        }


        resultLabel.setText("Sa oled tarbinud " + total + "kcal");
        GridPane.setConstraints(resultLabel, 1, 15);
        resultLabel1.setText("Sa võid veel süüa " + jaak + "kcal");
        GridPane.setConstraints(resultLabel1, 1, 16);
    }
}