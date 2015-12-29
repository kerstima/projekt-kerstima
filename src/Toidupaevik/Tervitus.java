
package Toidupaevik;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;


public class Tervitus {

    Button button;//arvutamise nupp
    Button button1; //akna sulgemise nupp
    Button button2; //t�hista valiku nupp
    Button button3; //selgitava akna nupp
    static boolean answer; //t�ev�rtus true v false

    Label resultLabel; //oled tabinud
    Label resultLabel1; //v�id veel s��a
    Label resultLabel2; //�letasid lubatud koguse


    ListView<String> listView;
    private List<Punnid> intValueCheckboxList = new ArrayList<>();//toiduainete massiiv
    private List<Sugu> intValueCheckboxList1 = new ArrayList<>();//mees-naine valiku massiiv
    Stage primaryStage = new Stage();

    Tervitus() {
        setupScene();//meetod, mis paneb paika stseeni
        setupNupp();//paneb paika arvuta/sulge/t�hista nupud
    }

    private void setupScene() {

        resultLabel = new Label();
        resultLabel1 = new Label();
        resultLabel2 = new Label();



        GridPane grid = new GridPane();//v�imaldab stseeni jagada osadeks, et iga asi oleks �iges kohas
        Scene scene = new Scene(grid, 1200, 800);// stseeni m��dud
        grid.setPadding(new Insets(10, 10, 10, 10)); //tekitab 10pixelise ��re �mber
        grid.setVgap(10);//tekitab vertikaalselt vahed
        grid.setHgap(10); //horisontaalselt vahed
        grid.setStyle("-fx-background-color: palegreen");//no saad taustav�rvi


        Label tervitus = new Label("Tere kaaluj�lgija!");
        tervitus.setFont(new Font("Forte", 24));//seab fondi
        GridPane.setConstraints(tervitus, 0, 0);//seab sildi esimesse tulpa ja esimesse lahtrisse

        Label Piimatooted = new Label("Piimatooted");
        Piimatooted.setFont(new Font("Forte", 24));//font muutus
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
        Teraviljatooted.setFont(new Font("Forte", 24));
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
        Punnid box11 = new Punnid("m�sli, 3 spl", 80);
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
        Rasvad.setFont(new Font("Forte", 24));
        GridPane.setConstraints(Rasvad, 2, 2);
        Label Rasv = new Label("2 portsu");
        GridPane.setConstraints(Rasv, 2, 3);

        Punnid box15 = new Punnid("majonees, 1 tl", 40);
        intValueCheckboxList.add(box15);
        GridPane.setConstraints(box15, 2, 4);
        Punnid box16 = new Punnid("taime�li, 1 tl", 40);
        intValueCheckboxList.add(box16);
        GridPane.setConstraints(box16, 2, 5);
        Punnid box17 = new Punnid("p�hklid 7g, ca 5tk", 40);
        intValueCheckboxList.add(box17);
        GridPane.setConstraints(box17, 2, 6);
        Punnid box18 = new Punnid("juust, 30 g", 40);
        intValueCheckboxList.add(box18);
        GridPane.setConstraints(box18, 2, 7);

        Label Proteiinid = new Label("Proteiinid");
        Proteiinid.setFont(new Font("Forte", 24));
        GridPane.setConstraints(Proteiinid, 3, 2);
        Label Prot = new Label("3 portsu");
        GridPane.setConstraints(Prot, 3, 3);

        Punnid box19 = new Punnid("liha (kana, veis, v�herasvane siga jt) 30 g", 60);
        intValueCheckboxList.add(box19);
        GridPane.setConstraints(box19, 3, 4);
        Punnid box20 = new Punnid("kala (heik, lest jt v�herasvased) 60 g", 60);
        intValueCheckboxList.add(box20);
        GridPane.setConstraints(box20, 3, 5);
        Punnid box21 = new Punnid("kala (angerjas, l�he, r�im, suitsukala) 30 g", 60);
        intValueCheckboxList.add(box21);
        GridPane.setConstraints(box21, 3, 6);
        Punnid box22 = new Punnid("kodujuust 80 g", 60);
        intValueCheckboxList.add(box22);
        GridPane.setConstraints(box22, 3, 7);
        Punnid box23 = new Punnid("kohupiim < 10 % rasva, 80 g", 60);
        intValueCheckboxList.add(box23);
        GridPane.setConstraints(box23, 3, 8);
        Punnid box24 = new Punnid("v�hk, krabi, krabipulk, 30 g", 60);
        intValueCheckboxList.add(box24);
        GridPane.setConstraints(box24, 3, 9);
        Punnid box25 = new Punnid("vorst, poolfabrikaadid, 30 g", 60);
        intValueCheckboxList.add(box25);
        GridPane.setConstraints(box25, 3, 10);
        Punnid box26 = new Punnid("muna, 1 tk", 60);
        intValueCheckboxList.add(box26);
        GridPane.setConstraints(box26, 3, 11);

        Label Puuviljad = new Label("Puuviljad");
        Puuviljad.setFont(new Font("Forte", 24));
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
        Punnid box31 = new Punnid("�un, 1 keskmine", 60);
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

        Image image = new Image(getClass().getResourceAsStream("naine.png"));//lisab pildid
        Image image1 = new Image(getClass().getResourceAsStream("mees.png"));

        Sugu box37 = new Sugu("Naine", 1700);//seob soo kasti max lubatud kcal arvuga
        intValueCheckboxList1.add(box37);
        GridPane.setConstraints(box37, 1, 0);
        Sugu box38 = new Sugu("Mees", 1800);
        intValueCheckboxList1.add(box38);
        GridPane.setConstraints(box38, 1, 1);

        box37.setOnAction((event3) -> {
            box37.setGraphic(new ImageView(image));//lisab mehe pildi, kui valime naise
            box38.setSelected(false);//kustutab linnukese �ra, kui varem oli valikus mees
            box38.setGraphic(null);
            box38.setText("Mees");//tagastab mehe sildi
        });

        box38.setOnAction((event4) -> {
            box38.setGraphic(new ImageView(image1));//sama mis eelmisel aga vastupidi
            box37.setSelected(false);
            box37.setText("Naine");
            box37.setGraphic(null);
            });

        button = new Button("Arvuta");
        GridPane.setConstraints(button, 1, 14);

        button1 = new Button("Sulge");
        GridPane.setConstraints(button1, 1, 15);

        button2 = new Button("T�hista valik");
        GridPane.setConstraints(button2, 1, 16);

        button3 = new Button("Kasutamis�petus");
        GridPane.setConstraints(button3, 4, 0);
//korjab kokku k�ik nupud ja muud valikud/sildid
        grid.getChildren().addAll(tervitus, Piimatooted, Piim, box1, box2, box3, box4, box5, box6,
                Teraviljatooted, Tera, box7, box8, box9, box10, box11, box12, box13, box14,
                Rasvad, Rasv, box15, box16, box17, box18,
                Proteiinid, Prot, box19, box20, box21, box22, box23, box24, box25, box26,
                Puuviljad, Puuv, box27, box28, box29, box30, box31, box32, box33, box34, box35, box36, box37, box38,
                resultLabel, resultLabel1, resultLabel2, button, button1, button2, button3);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //j�rgnev osa on selgitava akna t��s hoidmiseks (kasutatud koodi https://www.youtube.com/watch?v=SpL3EToqaXA)
    private boolean display(String title, String message) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinHeight(500);//seab minimaalse ja maksimaalse akna suuruse, kui maks ei pane, l�heb tekst �le ekraani laiali
        window.setMinWidth(700);
        window.setMaxHeight(600);
        window.setMaxWidth(800);

        Label label = new Label();
        label.setText(message);
        label.setWrapText(true);
        label.setTextAlignment(TextAlignment.JUSTIFY);//teksti ��red v�rdseks
        label.setFont(new Font("Calibri", 16));//font ja t�he suurus

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
    }// selgitava akna tegevus l�ppes, l�heb edasi p�hiosa

    private void setupNupp() {
        button.setOnAction((event) -> {
            calculate();//kutsub v�lja arvutamise meetodi
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
            for (Sugu sugu : intValueCheckboxList1) {
                sugu.setSelected(false);
                sugu.setGraphic(null);

            }
        });

        //selgitava akna tekst
        button3.setOnAction((event) -> {
            boolean result = display("Kuidas kasutada", "\n" +//kaldkriips+n l�ikab teksti ja viib j�rgmisele reale
                    "Toiduainete gruppide kohal on toodud p�evakogused portsjonites, mis tuleb �ra s��a.\n" +
                    "\n" +
                    "Kui neid �ra ei s��, siis teed tervisle liiga.\n" +
                    "Kui oled kontorirott ja s��d neist portsudest rohkem, siis kaalust alla ei v�ta\n" +
                    "\n" +
                    "Muidu v�ib v�heliikuv naisterahvas p�evas s��a 1700 kcalorit ja meesterahvas 1800 kcal\n" +
                    "Ekraanil olev tekst - v�id veel s��a- n�itab, et sa ei v�ta juurde\n" +
                    "\n" +
                    "Kui ekraanile tekib tekst, et oled s��nud rohkem, kui..., no siis paisud.\n " +
                    "\n" +
                    "NB! lisaks toodud portsudele pead iga p�ev s��ma veel 600 g v�i rohkem juurvilju\n" +
                    "(�ra muretse need kaloreid ei anna)\n" +
                    "\n" +
                    "Sa pead jooma 1,5 liitrit vett! \n" +
                    "\n" +
                    "NB! Otsusta kumb sa oled, naine v�i mees, muidu n�ed tulemust valesti");

            System.out.println(result);
        });
    }

    private void calculate() {

        int kogus = 0;
        for (Sugu sugu : intValueCheckboxList1){
            if (sugu.isSelected()){
                kogus = kogus + sugu.getValue();//v�tab �lalt, s�ltuvalt sellest, kas oled mees v�i naine maks lubatud koguse
            }
        }
        int jaak = 0;
        int jaakule = 0;
        int total = 0;

        for (Punnid box : intValueCheckboxList) {
            if (box.isSelected()) {
                total = total + box.getValue();//liidab valitud toiduainete kastide v��rtused
                jaak = kogus - total;//lahutab valitud v��rtused maksimaalsest lubatud kogusest (n�itab palju saab veel paisumata s��a)
                jaakule = total - kogus; //n�itab kui palju �le s��d, ilmub vaid siis kui �letad lubatud kogust

                if (total < kogus) {
                    resultLabel.setText("Sa oled tarbinud " + total + "kcal");
                    GridPane.setConstraints(resultLabel, 1, 18);
                    resultLabel1.setText("Sa v�id veel s��a " + jaak + "kcal");
                    GridPane.setConstraints(resultLabel1, 1, 19);
                } else {
                    resultLabel.setText("Sa oled tarbinud - " + total + "kcal");
                    GridPane.setConstraints(resultLabel, 1, 18);
                    resultLabel2.setText("Sa �letsid oma p�evanormi - " + jaakule + "kcal");
                    GridPane.setConstraints(resultLabel2, 1, 20);
                    resultLabel1.setText(null);
                }
            }
        }
    }
}