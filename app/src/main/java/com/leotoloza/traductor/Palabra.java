package com.leotoloza.traductor;

public class Palabra {
    private  String traducccion;
    private int img;
public Palabra(){}
    public Palabra(String traducccion, int img) {
        this.traducccion = traducccion;
        this.img = img;
    }

    public String getTraducccion() {
        return traducccion;
    }

    public void setTraducccion(String traducccion) {
        this.traducccion = traducccion;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
