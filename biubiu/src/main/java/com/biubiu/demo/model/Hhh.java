package com.biubiu.demo.model;

public class Hhh {
    private String dassad;

    public Hhh(String dassad) {
        this.dassad = dassad;
    }

    public Hhh() {
        super();
    }

    public String getDassad() {
        return dassad;
    }

    public void setDassad(String dassad) {
        this.dassad = dassad == null ? null : dassad.trim();
    }
}