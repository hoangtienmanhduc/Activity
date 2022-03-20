package com.example.activitya.model;

public class Languageactivity {
    private int id;
    private String ten;
    private String cuahang;
    private String giatien;

    public Languageactivity(int id,String ten,String cuahang,String giatien) {
        this.id = id;
        this.ten = ten;
        this.cuahang = cuahang;
        this.giatien = giatien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCuahang() {
        return cuahang;
    }

    public void setCuahang(String cuahang) {
        this.cuahang = cuahang;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

}
