package com.example.romaniatravelapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class City implements Serializable {
    private Integer id;
    private String cityName;
    private String images;
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
    }

    public City(Integer id, String name, String img,String url, String attractions, String descriptions){
        this.id=id;
        this.cityName=name;
        this.images=img;
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
}
