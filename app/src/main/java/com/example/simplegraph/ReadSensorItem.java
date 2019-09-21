package com.example.simplegraph;

public class ReadSensorItem {

    //@SerializedName("date")
    private String date;

    //@SerializedName("kelembaban_tanah")
    private String kelembabanTanah;

    //@SerializedName("suhu_udara")
    private String suhuUdara;

    //@SerializedName("kelembaban_udara")
    private String kelembabanUdara;

    //@SerializedName("id")
    private String id;

    //@SerializedName("time")
    private String time;

    //@SerializedName("kondisi_tanah")
    private String kondisiTanah;

    //@SerializedName("kondisi_selenoid")
    private String kondisiSelenoid;

    public void setDate(String date){
        this.date = date;
    }

    public String getDate(){
        return date;
    }

    public void setKelembabanTanah(String kelembabanTanah){
        this.kelembabanTanah = kelembabanTanah;
    }

    public String getKelembabanTanah(){
        return kelembabanTanah;
    }

    public void setSuhuUdara(String suhuUdara){
        this.suhuUdara = suhuUdara;
    }

    public String getSuhuUdara(){
        return suhuUdara;
    }

    public void setKelembabanUdara(String kelembabanUdara){
        this.kelembabanUdara = kelembabanUdara;
    }

    public String getKelembabanUdara(){
        return kelembabanUdara;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setTime(String time){
        this.time = time;
    }

    public String getTime(){
        return time;
    }

    public void setKondisiTanah(String kondisiTanah){
        this.kondisiTanah = kondisiTanah;
    }

    public String getKondisiTanah(){
        return kondisiTanah;
    }

    public void setKondisiSelenoid(String kondisiSelenoid){
        this.kondisiSelenoid = kondisiSelenoid;
    }

    public String getKondisiSelenoid(){
        return kondisiSelenoid;
    }
}
