package com.example.romaniatravelapp;

import java.io.Serializable;

public class City implements Serializable {
    private Integer id;
    private String cityName;
    private String images;
    private String img1;
    private String img2;
    private String img3;
    private String url;
    private String attractions;
    private String description;

    public City(){
        this.id=0;
        this.cityName="";
        this.images="";
        this.url="";
        this.attractions="";
        this.description="";
        this.img1="";
        this.img2="";
        this.img3="";
    }

    public City(Integer id, String name, String img,String img1,String img2,String img3,String url, String attractions, String descriptions){
        this.id=id;
        this.cityName=name;
        this.images=img;
        this.img1=img1;
        this.img2=img2;
        this.img3=img3;
        this.url=url;
        this.attractions=attractions;
        this.description=descriptions;
    }

    public Integer getId(){return id;}

    public void setId(Integer id){this.id=id;}

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getImage() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAttractions() {
        return attractions;
    }

    public void setAttractions(String attractions) {
        this.attractions = attractions;
    }

    public String getDescriptions() {
        return description;
    }

    public void setDescriptions(String descriptions) {
        this.description = descriptions;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String imag3) {
        this.img3 = imag3;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String imag2) {
        this.img2 = imag2;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String imag1) {
        this.img1 = imag1;
    }
}
