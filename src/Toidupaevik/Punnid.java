package Toidupaevik;

import javafx.scene.control.CheckBox;


public class Punnid extends CheckBox {

    private int value;


    public int getValue() {
        return value;
    }

    public Punnid (String text, int value) {
        super(text);
        this.value = value;
    }

    public Punnid (String text) {
        super(text);
    }
}
