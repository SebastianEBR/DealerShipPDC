package org.uniquindio.edu.co.pdc.model;

public enum CLevel {

    NORMAL(1),
    PREMIUM(2),
    VIP(3);

    private int value;

    CLevel(int value){
        this.value = value;
    }

    public int getValor(){return value;}

}
