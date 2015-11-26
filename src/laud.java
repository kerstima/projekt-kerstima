import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Kersti on 24/11/2015. Kasutatud koodi aadressilt: https://www.youtube.com/watch?v=SvmSNbXQSnQ
 */
public class laud extends tervitus {
    Stage Window;
    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        Window = primaryStage;

        //* puu jupid
        TreeItem<String> Juurikas, Piimatooted, Teraviljatooted, Rasvad, Proteiinid, Puuviljad, Juurikad, Vesi;

        //* puud koos hoidev jupp
        Juurikas = new TreeItem<>();
        Juurikas.setExpanded(true);

        //Piimatooted
        Piimatooted = makeBranch("Piimatooted", Juurikas);
        makeBranch("Rasvata piim, 300 ml", Piimatooted);
        makeBranch("1% piim, 200 ml", Piimatooted);
        makeBranch("2,5% piim, 200 ml", Piimatooted);
        makeBranch("1% keefiir, 200 ml", Piimatooted);
        makeBranch("2,5% keefir, 100 ml", Piimatooted);
        makeBranch(" jogurt (<100 cal), 100 ml", Piimatooted);

        //Teraviljatooted
        Teraviljatooted = makeBranch("Teraviljatooted", Juurikas);
        makeBranch("leib, keskmine viil, 30 g", Teraviljatooted);
        makeBranch("makaronid keedetud, 100 ml", Teraviljatooted);
        makeBranch("puder (riis, tatar, manna jt) 100 ml", Teraviljatooted);
        makeBranch("helbed (kaera, riisi jne) 75 ml", Teraviljatooted);
        makeBranch("m�sli, 3 spl", Teraviljatooted);
        makeBranch("herned (toored, konserv) 120 g", Teraviljatooted);
        makeBranch("mais (toores, konserv) 80 g", Teraviljatooted);
        makeBranch("1 keskmine maisit�lvik", Teraviljatooted);
        makeBranch("mais-hernes-paprika segu, 150 g", Teraviljatooted);
        makeBranch("kartul 2 pisikest v 1 keskmine", Teraviljatooted);

        //Rasvad
        Rasvad = makeBranch("Rasvad", Juurikas);
        makeBranch("majonees, 1 tl", Rasvad);
        makeBranch("taime�li, 1 tl", Rasvad);
        makeBranch("avokaado, 20 g", Rasvad);
        makeBranch("p�hklid 7g, ca 5tk", Rasvad);
        makeBranch("juust, 30 g", Rasvad);

        //Proteiinid
        Proteiinid = makeBranch("Proteiinid", Juurikas);
        makeBranch("liha (kana, veis, v�herasvane siga jt) 30 g", Proteiinid);
        makeBranch("kala (heik, lest jt v�herasvased) 60 g", Proteiinid);
        makeBranch("kala (angerjas, l�he, r�im, suitsukala) 30 g", Proteiinid);
        makeBranch("kodujuust 80 g", Proteiinid);
        makeBranch("kohupiim < 10 % rasva, 80 g", Proteiinid);
        makeBranch("v�hk, krabi, krabipulk, 30 g", Proteiinid);
        makeBranch("vorst, poolfabrikaadid, 30 g", Proteiinid);
        makeBranch("muna, 1 tk", Proteiinid);

        //Puuviljad
        Puuviljad = makeBranch("Puuviljad", Juurikas);
        makeBranch("ananass, 100 ml", Puuviljad);
        makeBranch("apelsin, 1 keskmine", Puuviljad);
        makeBranch("banaan, 1/2", Puuviljad);
        makeBranch("greip, 1/2", Puuviljad);
        makeBranch("kiivi, 1 tk", Puuviljad);
        makeBranch("�un, 1 keskmine", Puuviljad);
        makeBranch("viinamarjad 100 g", Puuviljad);
        makeBranch("nektariin, 1 keskmine", Puuviljad);
        makeBranch("pirn, 1 keskmine", Puuviljad);
        makeBranch("ploom, 3 keskmist", Puuviljad);
        makeBranch("marjad (s�strad, pohlad jne) 120 g", Puuviljad);

        //Juurikad
        Juurikad = makeBranch("Juurikad", Juurikas);

        //Vesi
        Vesi = makeBranch("Vesi", Juurikas);

        //Puu loomine
        tree = new TreeView<>(Juurikas);
        tree.setShowRoot(false);


        //V�limus
        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene= new Scene(layout, 300, 800);
        Window.setScene(scene);
        Window.show();
    }
    // Okste kokkut�mbamine
    public TreeItem<String> makeBranch(String title, TreeItem<String>parent){
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;

    }


}
