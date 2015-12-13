
package Toidupaevik;

import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class Tervitus {

    Button button;
    Button button1;
    Button button2;
    Button button3;
    static boolean answer;

    Label resultLabel;
    Label resultLabel1;
    Label resultLabel2;

    ListView<String> listView;
    private List<Punnid> intValueCheckboxList = new ArrayList<>();
    Stage primaryStage = new Stage();

    Tervitus() {
        setupScene();
        setupNupp();
    }

    private void setupNupp() {
        button.setOnAction((event) -> {
            calculate();
        });
        button1.setOnAction((event1) -> {
            primaryStage.close();
        });
        button2.setOnAction((event2) -> {
                    for (Punnid box : intValueCheckboxList) {
                        box.setSelected(false);
                        resultLabel1.setText(null);
                        resultLabel2.setText(null);
                        resultLabel.setText(null);
                    }
                }
        );
        //selgitav aken (kasutatud koodi https://www.youtube.com/watch?v=SpL3EToqaXA
        button3.setOnAction((event) -> {
            boolean result = display("Selgitus", "Tegemist on abivahendiga kaalujälgijale.\n" +//kaldkriips+n lõikab teksti ja viib järgmisele reale
                    "\n" +
                    "Toiduainete gruppide kohal on toodud päevakogused portsjonites, mis tuleb ära süüa.\n" +
                    "Kui neid ära ei söö, siis teed tervisle liiga.\n" +
                    "\n " +
                    "Kui sööd rohkem, siis kaalust alla ei võta\n" +
                    "\n" +
                    "Kui ekraanile tekib tekst, et oled söönud rohkem, kui..., no siis paisud.\n " +
                    "\n" +
                    "NB! lisaks toodud portsudele pead iga päev sööma veel 600 g või rohkem juurvilju\n" +
                    "(ära muretse need kaloreid ei anna)\n" +
                    "\n" +
                    "Sa pead jooma 1,5 liitrit vett! ");

            System.out.println(result);
        });
    }//järgnev osa on selgitava akna töös hoidmiseks
    private boolean display(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinHeight(400);//seab minimaalse ja maksimaalse akna suuruse, kui maks ei pane, läheb tekst üle ekraani laiali
        window.setMinWidth(600);
        window.setMaxHeight(500);
        window.setMaxWidth(700);

        Label label = new Label();
        label.setText(message);
        label.setWrapText(true);
        label.setTextAlignment(TextAlignment.JUSTIFY);
        Button closeButton = new Button("sulge");
        closeButton.setOnAction((event) -> {
            window.close();
        });

        VBox layout = new VBox(10.0D);
        layout.getChildren().addAll(new Node[]{label, closeButton});
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        return answer;
    }
// selgitava akna tegevus lõppes, läheb edasi põhiosa

    private void setupScene() {

        resultLabel = new Label();
        resultLabel1 = new Label();
        resultLabel2 = new Label();

        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 1200, 800);
        grid.setPadding(new Insets(10, 10, 10, 10)); //tekitab 10pixelise ääre ümber
        grid.setVgap(10);//tekitab vertikaalselt vahed
        grid.setHgap(10); //horisontaalselt vahed

        Label tervitus = new Label("Tere kaalujälgija!");
        GridPane.setConstraints(tervitus, 0, 0);//seab sildi esimesse tulpa ja esimesse lahtrisse

        Label Piimatooted = new Label("Piimatooted");
        GridPane.setConstraints(Piimatooted, 0, 2);//esimene on tulba, teine rea number
        Label Piim = new Label("2 portsu");
        GridPane.setConstraints(Piim, 0, 3);

        Punnid box1 = new Punnid("Rasvata piim, 300 ml", 90);
        intValueCheckboxList.add(box1);
        GridPane.setConstraints(box1, 0, 4);
        Punnid box2 = new Punnid("1% piim, 200 ml", 90);
        intValueCheckboxList.add(box2);
        GridPane.setConstraints(box2, 0, 5);
        Punnid box3 = new Punnid("2,5% piim, 200 ml", 90);
        intValueCheckboxList.add(box3);
        GridPane.setConstraints(box3, 0, 6);
        Punnid box4 = new Punnid("1% keefiir, 200 ml", 90);
        intValueCheckboxList.add(box4);
        GridPane.setConstraints(box4, 0, 7);
        Punnid box5 = new Punnid("2,5% keefir, 100 ml", 90);
        intValueCheckboxList.add(box5);
        GridPane.setConstraints(box5, 0, 8);
        Punnid box6 = new Punnid("jogurt (<100 cal), 100 ml", 90);
        intValueCheckboxList.add(box6);
        GridPane.setConstraints(box6, 0, 9);

        Label Teraviljatooted = new Label("Teraviljatooted");
        GridPane.setConstraints(Teraviljatooted, 1, 2);
        Label Tera = new Label("4 portsu");
        GridPane.setConstraints(Tera, 1, 3);

        Punnid box7 = new Punnid("leib, keskmine viil, 30 g", 80);
        intValueCheckboxList.add(box1);
        GridPane.setConstraints(box7, 1, 4);
        Punnid box8 = new Punnid("makaronid keedetud, 100 ml", 80);
        intValueCheckboxList.add(box8);
        GridPane.setConstraints(box8, 1, 5);
        Punnid box9 = new Punnid("puder (riis, tatar, manna jt) 100 ml", 80);
        intValueCheckboxList.add(box9);
        GridPane.setConstraints(box9, 1, 6);
        Punnid box10 = new Punnid("helbed (kaera, riisi jne) 75 ml", 80);
        intValueCheckboxList.add(box10);
        GridPane.setConstraints(box10, 1, 7);
        Punnid box11 = new Punnid("müsli, 3 spl", 80);
        intValueCheckboxList.add(box11);
        GridPane.setConstraints(box11, 1, 8);
        Punnid box12 = new Punnid("herned (toored, konserv) 120 g", 80);
        intValueCheckboxList.add(box12);
        GridPane.setConstraints(box12, 1, 9);
        Punnid box13 = new Punnid("mais (toores, konserv) 80 g", 80);
        intValueCheckboxList.add(box13);
        GridPane.setConstraints(box13, 1, 10);
        Punnid box14 = new Punnid("kartul 2 pisikest v 1 keskmine", 80);
        intValueCheckboxList.add(box14);
        GridPane.setConstraints(box14, 1, 11);

        Label Rasvad = new Label("Rasvad");
        GridPane.setConstraints(Rasvad, 2, 2);
        Label Rasv = new Label("2 portsu");
        GridPane.setConstraints(Rasv, 2, 3);

        Punnid box15 = new Punnid("majonees, 1 tl", 40);
        intValueCheckboxList.add(box15);
        GridPane.setConstraints(box15, 2, 4);
        Punnid box16 = new Punnid("taimeõli, 1 tl", 40);
        intValueCheckboxList.add(box16);
        GridPane.setConstraints(box16, 2, 5);
        Punnid box17 = new Punnid("pähklid 7g, ca 5tk", 40);
        intValueCheckboxList.add(box17);
        GridPane.setConstraints(box17, 2, 6);
        Punnid box18 = new Punnid("juust, 30 g", 40);
        intValueCheckboxList.add(box18);
        GridPane.setConstraints(box18, 2, 7);

        Label Proteiinid = new Label("Proteiinid");
        GridPane.setConstraints(Proteiinid, 3, 2);
        Label Prot = new Label("3 portsu");
        GridPane.setConstraints(Prot, 3, 3);

        Punnid box19 = new Punnid("liha (kana, veis, väherasvane siga jt) 30 g", 60);
        intValueCheckboxList.add(box19);
        GridPane.setConstraints(box19, 3, 4);
        Punnid box20 = new Punnid("kala (heik, lest jt väherasvased) 60 g", 60);
        intValueCheckboxList.add(box20);
        GridPane.setConstraints(box20, 3, 5);
        Punnid box21 = new Punnid("kala (angerjas, lõhe, räim, suitsukala) 30 g", 60);
        intValueCheckboxList.add(box21);
        GridPane.setConstraints(box21, 3, 6);
        Punnid box22 = new Punnid("kodujuust 80 g", 60);
        intValueCheckboxList.add(box22);
        GridPane.setConstraints(box22, 3, 7);
        Punnid box23 = new Punnid("kohupiim < 10 % rasva, 80 g", 60);
        intValueCheckboxList.add(box23);
        GridPane.setConstraints(box23, 3, 8);
        Punnid box24 = new Punnid("vähk, krabi, krabipulk, 30 g", 60);
        intValueCheckboxList.add(box24);
        GridPane.setConstraints(box24, 3, 9);
        Punnid box25 = new Punnid("vorst, poolfabrikaadid, 30 g", 60);
        intValueCheckboxList.add(box25);
        GridPane.setConstraints(box25, 3, 10);
        Punnid box26 = new Punnid("muna, 1 tk", 60);
        intValueCheckboxList.add(box26);
        GridPane.setConstraints(box26, 3, 11);

        Label Puuviljad = new Label("Puuviljad");
        GridPane.setConstraints(Puuviljad, 4, 2);
        Label Puuv = new Label("3 portsu");
        GridPane.setConstraints(Puuv, 4, 3);

        Punnid box27 = new Punnid("apelsin, 1 keskmine", 60);
        intValueCheckboxList.add(box27);
        GridPane.setConstraints(box27, 4, 4);
        Punnid box28 = new Punnid("banaan, 1/2", 60);
        intValueCheckboxList.add(box28);
        GridPane.setConstraints(box28, 4, 5);
        Punnid box29 = new Punnid("greip, 1/2", 60);
        intValueCheckboxList.add(box29);
        GridPane.setConstraints(box29, 4, 6);
        Punnid box30 = new Punnid("kiivi, 1 tk", 60);
        intValueCheckboxList.add(box30);
        GridPane.setConstraints(box30, 4, 7);
        Punnid box31 = new Punnid("õun, 1 keskmine", 60);
        intValueCheckboxList.add(box31);
        GridPane.setConstraints(box31, 4, 8);
        Punnid box32 = new Punnid("viinamarjad 100 g", 60);
        intValueCheckboxList.add(box32);
        GridPane.setConstraints(box32, 4, 9);
        Punnid box33 = new Punnid("nektariin, 1 keskmine", 60);
        intValueCheckboxList.add(box33);
        GridPane.setConstraints(box33, 4, 10);
        Punnid box34 = new Punnid("pirn, 1 keskmine", 60);
        intValueCheckboxList.add(box34);
        GridPane.setConstraints(box34, 4, 11);
        Punnid box35 = new Punnid("ploom, 3 keskmist", 60);
        intValueCheckboxList.add(box35);
        GridPane.setConstraints(box35, 4, 12);
        Punnid box36 = new Punnid("marjad 120 g", 60);
        intValueCheckboxList.add(box36);
        GridPane.setConstraints(box36, 4, 13);

        button = new Button("Arvuta");
        GridPane.setConstraints(button, 1, 14);

        button1 = new Button("Sulge");
        GridPane.setConstraints(button1, 1, 15);

        button2 = new Button("Tühista valik");
        GridPane.setConstraints(button2, 1, 16);

        button3 = new Button("Kasutamisõpetus");
        GridPane.setConstraints(button3, 2, 0);

        grid.getChildren().addAll(tervitus, Piimatooted, Piim, box1, box2, box3, box4, box5, box6,
                Teraviljatooted, Tera, box7, box8, box9, box10, box11, box12, box13, box14,
                Rasvad, Rasv, box15, box16, box17, box18,
                Proteiinid, Prot, box19, box20, box21, box22, box23, box24, box25, box26,
                Puuviljad, Puuv, box27, box28, box29, box30, box31, box32, box33, box34, box35, box36,
                resultLabel, resultLabel1, resultLabel2, button, button1, button2, button3);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void calculate() {
        int total = 0;
        int kogus = 700;
        int jaak = 0;
        int jaakule = 0;

        for (Punnid box : intValueCheckboxList) {
            if (box.isSelected()) {
                total = total + box.getValue();
                jaak = kogus - total;
                jaakule = total - kogus;

                if (total < kogus) {
                    resultLabel.setText("Sa oled tarbinud " + total + "kcal");
                    GridPane.setConstraints(resultLabel, 1, 18);
                    resultLabel1.setText("Sa võid veel süüa " + jaak + "kcal");
                    GridPane.setConstraints(resultLabel1, 1, 19);
                } else {
                    resultLabel.setText("Sa oled tarbinud - " + total + "kcal");
                    GridPane.setConstraints(resultLabel, 1, 18);
                    resultLabel2.setText("Sa ületsid oma päevanormi - " + jaakule + "kcal");
                    GridPane.setConstraints(resultLabel2, 1, 20);
                    resultLabel1.setText(null);
                }
            }
        }
    }
}