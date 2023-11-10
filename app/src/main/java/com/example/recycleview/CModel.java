package com.example.recycleview;

import java.io.Serializable;

public class CModel implements Serializable {

    public String color;
    public String nama;
    public String hp;
    public String status;

    public CModel(String color, String nama, String hp, String status) {
        this.color = color;
        this.nama = nama;
        this.hp = hp;
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
