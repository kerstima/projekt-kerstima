package Toidupaevik;

import javafx.scene.control.CheckBox;

/**
 * Created by Polina on 29.11.2015.
 */
public class punnid extends CheckBox {

    private int value;

    public punnid(String text) {
        super(text);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
