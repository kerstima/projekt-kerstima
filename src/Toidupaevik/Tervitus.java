package Toidupaevik;

import Toidupaevik.tooted.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;
import Toidupaevik.tooted.*;

import java.util.ArrayList;
import java.util.List;

public class Tervitus {

    Button calcButton;
    Button exitButton;
    Button clearButton;
    Button explanationButton;
    static boolean answer; //tõevärtus true v false

    Label resultLabel;
    Label resultLabel1;
    Label resultLabel2;
    Label resultLabel3;
    Label resultLabel4;

    private List<Sugu> suguArrayList = new ArrayList<>();
    private List<Punnid> punnidArrayList = new ArrayList<>();
    Stage primaryStage = new Stage();


    public Tervitus() {
        setupScene();
    }
    //järgnev osa on selgitava akna töös hoidmiseks (kasutatud koodi https://www.youtube.com/watch?v=SpL3EToqaXA)
    private boolean display(String title, String message) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinHeight(500);//seab minimaalse ja maksimaalse akna suuruse, kui maks ei pane, läheb tekst üle ekraani laiali
        window.setMinWidth(700);
        window.setMaxHeight(600);
        window.setMaxWidth(800);

        Label label = new Label();
        label.setText(message);
        label.setWrapText(true);
        label.setTextAlignment(TextAlignment.JUSTIFY);//teksti ääred võrdseks
        label.setFont(new Font("Calibri", 16));//font ja tähe suurus

        Button closeButton = new Button("sulge");
        closeButton.setOnAction((event) -> {
            window.close();
        });

        VBox layout = new VBox(10.0D);
        layout.getChildren().addAll(new Node[]{label, closeButton});
        layout.setAlignment(Pos.CENTER);//paigutab aknas sulgemise nupu keskele
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        return answer;
    }// selgitava akna tegevus lõppes, läheb edasi põhiosa

    private void setupNupp(GridPane grid) {
        calcButton = new Button("Arvuta");
        grid.add(calcButton, 1, 13);
        exitButton = new Button("Sulge");
        grid.add(exitButton, 1, 14);
        clearButton = new Button("Tühista valik");
        grid.add(clearButton, 1, 15);
        explanationButton = new Button("Kasutamisõpetus");
        grid.add(explanationButton, 4, 0);


        calcButton.setOnAction((event) -> {
            calculate();
        });

        exitButton.setOnAction((event1) -> {
            primaryStage.close();
        });

        clearButton.setOnAction((event2) -> {
            for (Punnid box : punnidArrayList) {
                box.setSelected(false);
                resultLabel1.setText(null);
                resultLabel2.setText(null);
                resultLabel.setText(null);
            }
            for (Sugu sugu : suguArrayList) {
                sugu.setSelected(false);
                sugu.setGraphic(null);
                resultLabel3.setText(null);
                resultLabel4.setText(null);
            }
        });
        //selgitava akna tekst
        explanationButton.setOnAction((event) -> {
            boolean result = display("Kuidas kasutada", "\n" +//kaldkriips+n lõikab teksti ja viib järgmisele reale
                    "Toiduainete gruppide kohal on toodud päevakogused portsjonites, mis tuleb ära süüa.\n" +
                    "\n" +
                    "Kui neid ära ei söö, siis teed tervisle liiga.\n" +
                    "Kui oled kontorirott ja sööd neist portsudest rohkem, siis kaalust alla ei võta\n" +
                    "\n" +
                    "Muidu võib väheliikuv naisterahvas päevas süüa 1700 kcalorit ja meesterahvas 1800 kcal\n" +
                    "Ekraanil olev tekst - võid veel süüa- näitab, et sa ei võta juurde\n" +
                    "\n" +
                    "Kui ekraanile tekib tekst, et oled söönud rohkem, kui..., no siis paisud.\n " +
                    "\n" +
                    "NB! lisaks toodud portsudele pead iga päev sööma veel 600 g või rohkem juurvilju\n" +
                    "(ära muretse need kaloreid ei anna)\n" +
                    "\n" +
                    "Sa pead jooma 1,5 liitrit vett! \n" +
                    "\n" +
                    "NB! Otsusta kumb sa oled, naine või mees, muidu näed tulemust valesti");

            System.out.println(result);
        });
    }

    private void setupScene() {
        resultLabel = new Label();
        resultLabel1 = new Label();
        resultLabel2 = new Label();
        resultLabel3 = new Label();
        resultLabel4 = new Label();

//https://docs.oracle.com/javafx/2/ui_controls/radio-button.htm
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 1200, 900);

        grid.setPadding(new Insets(10, 10, 10, 10)); //tekitab 10pixelise ääre ümber
        grid.setVgap(15);//tekitab vertikaalselt vahed
        grid.setHgap(15); //horisontaalselt vahed
        grid.setStyle("-fx-background-color: palegreen");//no saad taustavärvi

        grid.add(new Label("Tere kaalujälgija!"), 0, 0);


        new PiimaToodetLisaja(grid).lisaToodet(punnidArrayList, 0);
        new TeraViljadToodetLisaja(grid).lisaToodet(punnidArrayList, 1);
        new FatToodetLisaja(grid).lisaToodet(punnidArrayList, 2);
        new ProteinToodetLisaja(grid).lisaToodet(punnidArrayList, 3);
        new FruitToodetLisaja(grid).lisaToodet(punnidArrayList, 4);

        setupSuguBoksid(grid);

        setupNupp(grid);

        grid.getChildren().addAll(resultLabel, resultLabel1, resultLabel2, resultLabel3, resultLabel4);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void setupSuguBoksid(GridPane grid) {
        Sugu meesSuguBox = new Sugu("Mees", 1800);
        grid.add(meesSuguBox, 2, 14);
        suguArrayList.add(meesSuguBox);
        Sugu naineSuguBox = new Sugu("Naine", 1700);
        grid.add(naineSuguBox, 2, 15);
        suguArrayList.add(naineSuguBox);

        naineSuguBox.setOnAction((event3) -> {
            naineSuguBox.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("naine.png"), 50, 50, false, false)));
            naineSuguBox.setText(null);
            meesSuguBox.setSelected(false);
            meesSuguBox.setGraphic(null);
            meesSuguBox.setText("Mees");
            resultLabel3.setText("Sinu lubatud päevanorm on 1700 kcal");
            GridPane.setConstraints(resultLabel3, 3, 15);
            resultLabel4.setText(null);
        });
        meesSuguBox.setOnAction((event4 -> {
            meesSuguBox.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("mees.png"), 50, 50, false, false)));
            naineSuguBox.setSelected(false);
            naineSuguBox.setText("Naine");
            naineSuguBox.setGraphic(null);
            meesSuguBox.setText(null);
            resultLabel4.setText("Sinu lubatud päevanorm on 1800 kcal");
            GridPane.setConstraints(resultLabel4, 3, 14);
            resultLabel3.setText(null);
        }));

    }

    private void calculate() {
        int kogus = 0;
        for (Sugu sugu : suguArrayList) {
            if (sugu.isSelected()) {
                kogus = kogus + sugu.getValue();
                resultLabel2.setText(null);
            }

        }
        int total = 0;
        int jaak = 0;
        int jaakule = 0;

        for (Punnid box : punnidArrayList) {
            if (box.isSelected()) {
                total = total + box.getValue();
                jaak = kogus - total;
                jaakule = total - kogus;

                if (total < kogus) {
                    resultLabel.setText("Sa oled tarbinud " + total + "kcal");
                    GridPane.setConstraints(resultLabel, 3, 16);
                    resultLabel1.setText("Sa võid veel süüa " + jaak + "kcal");
                    GridPane.setConstraints(resultLabel1, 3, 17);
                    resultLabel2.setText(null);
                } else {
                    resultLabel.setText("Sa oled tarbinud - " + total + "kcal");
                    GridPane.setConstraints(resultLabel, 3, 16);
                    resultLabel2.setText("Sa ületasid oma päevanormi - " + jaakule + "kcal");
                    GridPane.setConstraints(resultLabel2, 1, 17);
                    resultLabel1.setText(null);
                }
            }
        }
        if (kogus == 0) {
            resultLabel2.setText(null);
        }
    }
}
