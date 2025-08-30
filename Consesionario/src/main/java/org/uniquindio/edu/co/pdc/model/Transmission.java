package org.uniquindio.edu.co.pdc.model;

public enum Transmission {

    MANUAL(1),
    AUTOMATIC(2);

    private int value;

    Transmission(int value){
        this.value = value;
    }

    public int getValue(){return value;}

}
